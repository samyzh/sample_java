package com.zsy.frame.sample.java.control.security.asymmetrical;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

import org.apache.commons.codec.binary.Base64;

//import com.sun.org.apache.xalan.internal.utils.Objects;

public class DHTest {
	public static final String src = "samy security dh";

	public static void main(String[] args) {
		jdkDH();

	}

	// jdk实现：
	public static void jdkDH() {
		try {
			// 1.初始化发送方密钥
			KeyPairGenerator senderKeyPairGenerator = KeyPairGenerator.getInstance("DH");
			senderKeyPairGenerator.initialize(512);
			KeyPair senderKeyPair = senderKeyPairGenerator.generateKeyPair();
			// 发送方公钥，发送给接收方（网络、文件。。。）
			byte[] senderPublicKeyEnc = senderKeyPair.getPublic().getEncoded();

			// 2.初始化接收方密钥
			KeyFactory receiverKeyFactory = KeyFactory.getInstance("DH");
			// X509EncodedKeySpec类根据ASN.1标准进行密钥编码
			X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(senderPublicKeyEnc);
			PublicKey receiverPublicKey = receiverKeyFactory.generatePublic(x509EncodedKeySpec);
			DHParameterSpec dhParameterSpec = ((DHPublicKey) receiverPublicKey).getParams();
			KeyPairGenerator receiverKeyPairGenerator = KeyPairGenerator.getInstance("DH");
			receiverKeyPairGenerator.initialize(dhParameterSpec);
			
			KeyPair receiverKeypair = receiverKeyPairGenerator.generateKeyPair();
//			得到公钥和私钥
//			PublicKey receiverPublicKey = receiverKeypair.getPublic();
			PrivateKey receiverPrivateKey = receiverKeypair.getPrivate();
			byte[] receiverPublicKeyEnc = receiverKeypair.getPublic().getEncoded();

			// 3.使用公私钥生产本地密钥
//			KeyAgreement类提供密钥一致性(或密钥交换)协议的功能
			KeyAgreement receiverKeyAgreement = KeyAgreement.getInstance("DH");//生成实现指定密钥一致算法的KeyAgreement对象
			receiverKeyAgreement.init(receiverPrivateKey);//用自己的密钥初始化KeyAgreement
			receiverKeyAgreement.doPhase(receiverPublicKey, true);//结合对方的公钥进行运算
			SecretKey receiverDesKey = receiverKeyAgreement.generateSecret("DES");//开始生成本地密钥SecretKey

			KeyFactory senderKeyFactory = KeyFactory.getInstance("DH");
			x509EncodedKeySpec = new X509EncodedKeySpec(receiverPublicKeyEnc);
			PublicKey senderPublicKey = senderKeyFactory.generatePublic(x509EncodedKeySpec);
			KeyAgreement senderKeyAgreement = KeyAgreement.getInstance("DH");
			senderKeyAgreement.init(senderKeyPair.getPrivate());
			senderKeyAgreement.doPhase(senderPublicKey, true);
			SecretKey senderDesKey = senderKeyAgreement.generateSecret("DES");
			if (Objects.equals(receiverDesKey, senderDesKey)) {
				System.out.println("双方密钥相同。");
			}

			// 4.加密
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, senderDesKey);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("bc dh encrypt:" + Base64.encodeBase64String(result));

			// 5.解密
			cipher.init(Cipher.DECRYPT_MODE, receiverDesKey);
			result = cipher.doFinal(result);
			System.out.println("bc dh decrypt:" + new String(result));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

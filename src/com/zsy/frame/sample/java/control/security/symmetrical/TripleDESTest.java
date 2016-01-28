package com.zsy.frame.sample.java.control.security.symmetrical;

import java.security.Key;
import java.security.SecureRandom;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * DES3
 * @description：
 * @author samy
 * @date 2015年11月22日 下午11:11:05
 */
public class TripleDESTest {
//	public static final String src = "samy security 3des";
	public static final String src = "SamyZhang";
    public static  String cipherType = "DESede"; //加密算法类型，可设置为DES、DESede、AES等字符串
	public static void main(String[] args) {
		jdk3DES();
		bc3DES();
	}

	// 用jdk实现:
	public static void jdk3DES() {
		try {
			// 生成KEY
//			KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
			KeyGenerator keyGenerator = KeyGenerator.getInstance(cipherType);
			// 必须长度是：112或168
//			 keyGenerator.init(168);
			keyGenerator.init(new SecureRandom());
			// 产生密钥
			SecretKey secretKey = keyGenerator.generateKey();
            //得到密钥字节码
			byte[] bytesKey = secretKey.getEncoded();
            //输出密钥的字节码
            System.out.println("密钥是：");
            for (int i = 0; i < bytesKey.length; i++) {
                System.out.print(bytesKey[i] + ",");
            }

			// KEY转换
//			DESKeySpec desKeySpec = new DESKeySpec(bytesKey);
			DESedeKeySpec desKeySpec = new DESedeKeySpec(bytesKey);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DESede");
			Key convertSecretKey = factory.generateSecret(desKeySpec);

			// 加密
//			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("jdk 3des encrypt:" + Hex.encodeHexString(result));

			// 解密
			cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
			result = cipher.doFinal(result);
			System.out.println("jdk 3des decrypt:" + new String(result));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 用bouncy castle实现:
	public static void bc3DES() {
		try {
			Security.addProvider(new BouncyCastleProvider());

			// 生成KEY
			KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede", "BC");
			keyGenerator.getProvider();
			keyGenerator.init(168);
			// 产生密钥
			SecretKey secretKey = keyGenerator.generateKey();
			// 获取密钥
			byte[] bytesKey = secretKey.getEncoded();

			// KEY转换
			DESedeKeySpec desKeySpec = new DESedeKeySpec(bytesKey);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DESede");
			Key convertSecretKey = factory.generateSecret(desKeySpec);

			// 加密
			Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("bc 3des encrypt:" + Hex.encodeHexString(result));

			// 解密
			cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
			result = cipher.doFinal(result);
			System.out.println("bc 3des decrypt:" + new String(result));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

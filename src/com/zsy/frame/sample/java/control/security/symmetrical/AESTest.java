package com.zsy.frame.sample.java.control.security.symmetrical;

import java.security.Key;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class AESTest {
	public static final String src = "samy security aes";
	
    static Cipher cipher;  
    static final String KEY_ALGORITHM = "AES";  
    static final String CIPHER_ALGORITHM_ECB = "AES/ECB/PKCS5Padding";  
    /* 
     *  
     */  
    static final String CIPHER_ALGORITHM_CBC = "AES/CBC/PKCS5Padding";  
    /*  
     * AES/CBC/NoPadding 要求 
     * 密钥必须是16位的；Initialization vector (IV) 必须是16位 
     * 待加密内容的长度必须是16的倍数，如果不是16的倍数，就会出如下异常： 
     * javax.crypto.IllegalBlockSizeException: Input length not multiple of 16 bytes 
     *  
     *  由于固定了位数，所以对于被加密数据有中文的, 加、解密不完整 
     *   
     *  可 以看到，在原始数据长度为16的整数n倍时，假如原始数据长度等于16*n，则使用NoPadding时加密后数据长度等于16*n， 
     *  其它情况下加密数据长 度等于16*(n+1)。在不足16的整数倍的情况下，假如原始数据长度等于16*n+m[其中m小于16]， 
     *  除了NoPadding填充之外的任何方 式，加密数据长度都等于16*(n+1). 
     */  
    static final String CIPHER_ALGORITHM_CBC_NoPadding = "AES/CBC/NoPadding";   

	public static void main(String[] args) {
		jdkAES();
		bcAES();
	}

	// 用jdk实现:
	public static void jdkAES() {
		try {
			// 生成KEY
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//			keyGenerator.init(128);
			keyGenerator.init(192);
			// 产生密钥
			SecretKey secretKey = keyGenerator.generateKey();
			// 获取密钥
			byte[] keyBytes = secretKey.getEncoded();

			// KEY转换
////			DESKeySpec desKeySpec = new DESKeySpec(bytesKey);
//			DESedeKeySpec desKeySpec = new DESedeKeySpec(bytesKey);
//			SecretKeyFactory factory = SecretKeyFactory.getInstance("DESede");
//			Key convertSecretKey = factory.generateSecret(desKeySpec);
			Key key = new SecretKeySpec(keyBytes, "AES");

			// 加密
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("jdk aes encrypt:" + Hex.encodeHexString(result));

			// 解密
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = cipher.doFinal(result);
			System.out.println("jdk aes decrypt:" + new String(result));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 用bouncy castle实现:
	public static void bcAES() {
		try {
			Security.addProvider(new BouncyCastleProvider());

			// 生成KEY
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "BC");
			keyGenerator.getProvider();
			keyGenerator.init(128);
			// 产生密钥
			SecretKey secretKey = keyGenerator.generateKey();
			// 获取密钥
			byte[] keyBytes = secretKey.getEncoded();

			// KEY转换
			Key key = new SecretKeySpec(keyBytes, "AES");

			// 加密
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("bc aes encrypt:" + Hex.encodeHexString(result));

			// 解密
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = cipher.doFinal(result);
			System.out.println("bc aes decrypt:" + new String(result));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

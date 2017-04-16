package com.zsy.frame.sample.java.control.security.hmac_sha1;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author conmind
 */
public class Test {
	public static void main(String[] args) {
		try {
//			//需要加密的数据
//			String data = "456";
//			//密钥
//			String key = "123";
			
			String key = "qqs/web-app";
			String data = "Index86E13CBA-6E64-475F-AF7A-E5BD45446FA91492221064000/appactivitydetail/getCoActivityList.do";
			
			our(data,key);
			standard(data, key);
//			standardCrypto(data,key);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void our(String data, String key){
		byte[] b = HMACSHA1.getHmacSHA1(data, key);
		String s = new BASE64Encoder().encode(b);
		System.out.println("our ---hmacsha1 = " + s);
		//hmacsha1 = 1Ytj9BoNsHnSqWm4OH9a3KaS070=
	}
	
	private static void standard(String data, String key) throws IOException {
        byte[] byteHMAC = null;
        byte[] keyBytes=key.getBytes("utf-8"); 
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec spec = new SecretKeySpec(keyBytes, "HmacSHA1");
            mac.init(spec);
            byteHMAC = mac.doFinal(data.getBytes("utf-8"));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException ignore) {
        }
        //方式一：
		String oauth = new BASE64Encoder().encode(byteHMAC);
		System.out.println("standard = "+oauth);
        //standard = 1Ytj9BoNsHnSqWm4OH9a3KaS070=
		 //方式二：
//        System.out.println("standard jdk byteHMAC 加密前:" + byteHMAC);//[B@12bc6874
//        BASE64Encoder encoder = new BASE64Encoder();
//		String encode =  encoder.encode(byteHMAC);
//		System.out.println("standard jdk encode 加密后:" + encode);

//		BASE64Decoder decoder = new BASE64Decoder();
//		byte[] decode = decoder.decodeBuffer(encode);
//		System.out.println("standard jdk decode 解码后:" + new String(decode,"utf-8"));
		
		 //方式三：
        System.out.println("standard jdk byteHMAC 加密前:" + byteHMAC);
        String encode = Base64.getEncoder().encodeToString(byteHMAC);
		System.out.println("standard jdk encode 加密后:" + encode);
		byte[] decode = Base64.getDecoder().decode(encode);
		System.out.println("standard jdk decode 解码后:" + new String(decode,"utf-8"));
		
    }
	
	private static void standardCrypto(String data, String key) {
		 byte[] keyBytes=key.getBytes();  
		 StringBuilder sb=new StringBuilder(); 
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(data.getBytes());
            System.out.println("standardCrypto------rawHmac->"+rawHmac);
            for(byte b:rawHmac){  
             sb.append(byteToHexString(b));  
            }  
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException ignore) {
        }
//        String oauth = new BASE64Encoder().encode(byteHMAC);
//        System.out.println("standard = "+oauth);
        System.out.println("standardCrypto------->"+sb);
        //standardCrypto = d58b63f41a0db079d2a969b8387f5adca692d3bd
//        BASE64Encoder encoder = new BASE64Encoder();
//		String encode = encoder.encode(sb.toString());
//        System.out.println("standardCrypto- base64------>"+BASE64Encoder);
    }
	
	
    private static String byteToHexString(byte ib){  
        char[] Digit={  
          '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'  
        };  
        char[] ob=new char[2];  
        ob[0]=Digit[(ib>>>4)& 0X0f];  
        ob[1]=Digit[ib & 0X0F];  
        String s=new String(ob);  
        System.out.println("byteToHexString------->"+s);
        return s;           
       }
}


package com.zsy.frame.sample.java.control.security.hmac_sha1;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacShaUtil {

	private static final String HMAC_SHA1 = "HmacSHA1";     
    
    /**   
     * 生成签名数据 
     * @param data 待加密的数据   
     * @param key  加密使用的key   
     * @throws InvalidKeyException   
     * @throws NoSuchAlgorithmException   
     */    
    public static String getSignature(String data,String key) throws Exception{  
     byte[] keyBytes=key.getBytes();  
        SecretKeySpec signingKey = new SecretKeySpec(keyBytes, HMAC_SHA1);     
        Mac mac = Mac.getInstance(HMAC_SHA1);     
        mac.init(signingKey);     
        byte[] rawHmac = mac.doFinal(data.getBytes());  
        StringBuilder sb=new StringBuilder();  
        for(byte b:rawHmac){  
         sb.append(byteToHexString(b));  
        }  
        return sb.toString();     
    }  
      
    private static String byteToHexString(byte ib){  
     char[] Digit={  
       '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'  
     };  
     char[] ob=new char[2];  
     ob[0]=Digit[(ib>>>4)& 0X0f];  
     ob[1]=Digit[ib & 0X0F];  
     String s=new String(ob);  
     return s;           
    }
    
	public static void main(String[] args) {
		try {
//			//需要加密的数据
//			String data = "456";
//			//密钥
//			String key = "123";
			String key = "qqs/web-app";
			String data = "Index86E13CBA-6E64-475F-AF7A-E5BD45446FA91492221064000/appactivitydetail/getCoActivityList.do";
			String s = getSignature(data,key);
			System.out.println("hmacsha1 = " + s);
			//hmacsha1 = d58b63f41a0db079d2a969b8387f5adca692d3bd
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

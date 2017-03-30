package com.sinosoft.ap.util;

import java.security.MessageDigest;

public class MD5Translate {
	public static String MD5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
 
        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
 
        byte[] md5Bytes = md5.digest(byteArray);
 
        StringBuffer hexValue = new StringBuffer();
 
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
 
        return hexValue.toString();
    }
	
	public static void main(String[] args) {
		String str="123456";
		String md5str="e10adc3949ba59abbe56e057f20f883e";
		String ceshi=MD5Translate.MD5(str);
		if (ceshi.equals(md5str)){
			System.out.println("success");
		}else{
			System.out.println("shibai");
		}
	}
}

package com.yuan.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.log4j.chainsaw.Main;

import sun.misc.BASE64Encoder;

public class MD5 {

	private static final char[] characters = {
			'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x',
			'y','z','~','!','@','#','$','%','^','*','&'
	};
	
	private MD5() {
	}

	public static String getMD5Code(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			BASE64Encoder base64Encoder = new BASE64Encoder();
			return base64Encoder.encode(md.digest(str.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getRandomStr(int length){
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		for(int i = 0;i < length;i++){
			builder.append(characters[random.nextInt(characters.length)]);
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		String password = "12345ÎÒ";
		String salt = getRandomStr(20);
		System.out.println(salt);
		String md5 = getMD5Code(password + "ewqtzuegj@h!~hablcgg");
		System.out.println(md5 + "," + md5.length() );
	}
}

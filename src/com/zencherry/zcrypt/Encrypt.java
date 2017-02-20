package com.zencherry.zcrypt;

import org.encryptor4j.util.TextEncryptor;

public class Encrypt {
	private final String securepass1="k0$rKJ%^4YjT";
	private final String securepass2="z#JPn0@2!Imy";
	private String securepass3="";
	
	public String getString(String text, String password) {
		securepass3 = securepass1+password+securepass2;
		try{
			TextEncryptor te = new TextEncryptor(securepass3);
			return te.encrypt(text);
			}catch(Exception e1){
				return null;
			}
	}
}

package com.mahmud.decrypt.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mahmud.decrypt.model.Crypt;

public class DecrypterUtil {

	
	private static char CAPITAL_A = 'A';
	private static char CAPITAL_Z = 'Z';
	
	private static char LOWER_A = 'a';
	private static char LOWER_Z = 'z';	
	
	
	public static String decrypt(String encryptedStr, int i) {
		char[] encryptedChars = encryptedStr.toCharArray();
		
		char[] decryptedChars = new char[encryptedChars.length];
		
		int index = 0;
		for(char c : encryptedChars)
		{
			char decryptedChar = c;
			if(c >=CAPITAL_A && c<= CAPITAL_Z)
			{
				
				int decryptedCharVal = (int)c - i;
				if(decryptedCharVal< CAPITAL_A)
				{
					decryptedCharVal = ((int)CAPITAL_Z + 1 ) - ( i - ((int)c-(int)CAPITAL_A) );
				}
				
				decryptedChar = (char)decryptedCharVal;
			}
			
			if(c >=LOWER_A && c<= LOWER_Z)
			{
				
				int decryptedCharVal = (int)c - i;
				if(decryptedCharVal< (int)LOWER_A)
				{
					
					
					decryptedCharVal = ((int)LOWER_Z + 1 ) - ( i - ((int)c-(int)LOWER_A) );
				}
				
				decryptedChar = (char)decryptedCharVal;
			}
			
			
			
			decryptedChars[index]  = decryptedChar;
			index++;
		}
		
		
		return new String(decryptedChars);
	}


	public static Map<Integer,Integer> populateRotationList(List<Crypt> cryptList) {
		Map<Integer,Integer> rotationMap = new HashMap<Integer, Integer>();
		
		for(Crypt crypt:cryptList)
		{
			rotationMap.put(crypt.getStart(),crypt.getRotate());
			for(int  i = 1 ; i< crypt.getLength(); i++ )
			{
				rotationMap.put(i+crypt.getStart(),crypt.getRotate());
			}
			
		}
		
		return rotationMap;
		
	}

}

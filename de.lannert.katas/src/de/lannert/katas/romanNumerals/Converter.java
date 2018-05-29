package de.lannert.katas.romanNumerals;

import java.util.HashMap;
import java.util.Map;

public class Converter {

	public int convertToNumber(String str) {
		
		int returned = 0;

		returned += str.chars().filter(c -> c == 'M').count()*1000
					+ str.chars().filter(c -> c == 'D').count()*500
					+ str.chars().filter(c -> c == 'C').count()*100
					+ str.chars().filter(c -> c == 'L').count()*50
					+ str.chars().filter(c -> c == 'X').count()*10
					+ str.chars().filter(c -> c == 'V').count()*5
					+ str.chars().filter(c -> c == 'I').count()
					;

		if (str.contains("IV") || str.contains("IX")) {
			returned += -2;
		}
		
		if (str.contains("XL") || str.contains("XC")) {
			returned += -20;
		}
		
		if (str.contains("CD") || str.contains("CM")) {
			returned += -200;
		}

		
		return returned;
		
	}

	public String toRoman(int i) {
		
		String roman = "";
		
		Map<Integer, String> romanNumeralMap = new HashMap<Integer, String>();
		romanNumeralMap.put(1000, "M");
		romanNumeralMap.put(900, "CM");
		romanNumeralMap.put(500, "D");
		romanNumeralMap.put(400, "CD");
		romanNumeralMap.put(100, "C");
		romanNumeralMap.put(90, "XC");
		romanNumeralMap.put(50, "L");
		romanNumeralMap.put(40, "XL");
		romanNumeralMap.put(10, "X");
		romanNumeralMap.put(9, "IX");
		romanNumeralMap.put(5, "V");
		romanNumeralMap.put(4, "IV");
		romanNumeralMap.put(1, "I");
		
		
		for (int key = 1000; key > 0; key-- ) {
			while ( !(null == romanNumeralMap.get(key)) && i >= key ) {
				roman += romanNumeralMap.get(key);
				i -= key;
			}	
		}		
		
		return roman;
	}

}
package de.lannert.katas.romanNumerals.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.lannert.katas.romanNumerals.Converter;

public class ConverterTest {
	
	Converter converter;
	
	@Before public void setUp() {
		
		converter = new Converter();
			
	}

	@Test
	public void test_whenInputting_anEmptyString_returns_Zero() {
		
		// Arrange
		String empty = "";
		
		// Act
		int number = converter.convertToNumber(empty);
		
		// Assert
		assertEquals(0,number);
		
	}
	
	@Test
	public void test_whenInputting_theString_I_returnsTheNumber_One() {
		// Arrange
		String str = "I";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(1,number);
	}
	
	@Test
	public void test_whenInputting_theString_II_returnsTheNumber_Two() {
		// Arrange
		String str = "II";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(2,number);
	}
	
	@Test
	public void test_whenInputting_theString_III_returnsTheNumber_Three() {
		// Arrange
		String str = "III";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(3,number);
	}
	
	@Test
	public void test_whenInputting_theString_IV_returnsTheNumber_Four() {
		// Arrange
		String str = "IV";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(4,number);
	}
	
	@Test
	public void test_whenInputting_theString_V_returnsTheNumber_Five() {
		// Arrange
		String str = "V";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(5,number);
	}
	
	@Test
	public void test_whenInputting_theString_VI_returnsTheNumber_Six() {
		// Arrange
		String str = "VI";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(6,number);
	}
	
	@Test
	public void test_whenInputting_theString_VII_returnsTheNumber_Seven() {
		// Arrange
		String str = "VII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(7,number);
	}
	
	@Test
	public void test_whenInputting_theString_VIII_returnsTheNumber_Eight() {
		// Arrange
		String str = "VIII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(8,number);
	}
	
	@Test
	public void test_whenInputting_theString_IX_returnsTheNumber_Nine() {
		// Arrange
		String str = "IX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(9,number);
	}
	
	@Test
	public void test_whenInputting_theString_X_returnsTheNumber_Ten() {
		// Arrange
		String str = "X";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(10,number);
	}
	
	@Test
	public void test_whenInputting_theString_XI_returnsTheNumber_Eleven() {
		// Arrange
		String str = "XI";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(11,number);
	}
	
	@Test
	public void test_whenInputting_theString_XII_returnsTheNumber_Twelve() {
		// Arrange
		String str = "XII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(12,number);
	}
	
	@Test
	public void test_whenInputting_theString_XIII_returnsTheNumber_Thirteen() {
		// Arrange
		String str = "XIII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(13,number);
	}
	
	@Test
	public void test_whenInputting_theString_XIV_returnsTheNumber_Fourteen() {
		// Arrange
		String str = "XIV";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(14,number);
	}
	
	@Test
	public void test_whenInputting_theString_XV_returnsTheNumber_Fifteen() {
		// Arrange
		String str = "XV";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(15,number);
	}
	
	@Test
	public void test_whenInputting_theString_XVI_returnsTheNumber_Sixteen() {
		// Arrange
		String str = "XVI";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(16,number);
	}
	
	@Test
	public void test_whenInputting_theString_XVII_returnsTheNumber_Seventeen() {
		// Arrange
		String str = "XVII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(17,number);
	}
	
	@Test
	public void test_whenInputting_theString_XVIII_returnsTheNumber_Eighteen() {
		// Arrange
		String str = "XVIII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(18,number);
	}
	
	@Test
	public void test_whenInputting_theString_XIX_returnsTheNumber_Nineteen() {
		// Arrange
		String str = "XIX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(19,number);
	}
	
	@Test
	public void test_whenInputting_theString_XX_returnsTheNumber_Twenty() {
		// Arrange
		String str = "XX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(20,number);
	}
	
	@Test
	public void test_whenInputting_theString_XXIV_returnsTheNumber_TwentyFour() {
		// Arrange
		String str = "XXIV";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(24,number);
	}
	
	@Test
	public void test_whenInputting_theString_XXIX_returnsTheNumber_TwentyNine() {
		// Arrange
		String str = "XXIX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(29,number);
	}
	
	@Test
	public void test_whenInputting_theString_XXXVVVIII_returnsTheNumber_ThirtyEight() {
		// Arrange
		String str = "XXXVVVIII";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(48,number);
	}
	
	@Test
	public void test_whenInputting_theString_L_returnsTheNumber_Fifty() {
		// Arrange
		String str = "L";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(50,number);
	}
	
	@Test
	public void test_whenInputting_theString_XL_returnsTheNumber_Forty() {
		// Arrange
		String str = "XL";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(40,number);
	}
	
	@Test
	public void test_whenInputting_theString_LXL_returnsTheNumber_Ninety() {
		// Arrange
		String str = "LXL";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(90,number);
	}
	
	
	@Test
	public void test_whenInputting_theString_LXLIX_returnsTheNumber_NinetyNine() {
		// Arrange
		String str = "LXLIX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(99,number);
	}
	
	@Test
	public void test_whenInputting_theString_C_returnsTheNumber_Hundred() {
		// Arrange
		String str = "C";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(100,number);
	}
	
	@Test
	public void test_whenInputting_theString_XC_returnsTheNumber_Ninety() {
		// Arrange
		String str = "XC";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(90,number);
	}
	
	@Test
	public void test_whenInputting_theString_D_returnsTheNumber_FiveHundred() {
		// Arrange
		String str = "D";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(500,number);
	}
	
	@Test
	public void test_whenInputting_theString_CD_returnsTheNumber_FourHundred() {
		// Arrange
		String str = "CD";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(400,number);
	}
	
	@Test
	public void test_whenInputting_theString_M_returnsTheNumber_Thousand() {
		// Arrange
		String str = "M";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(1000,number);
	}
	
	@Test
	public void test_whenInputting_theString_CM_returnsTheNumber_NineHundred() {
		// Arrange
		String str = "CM";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(900,number);
	}
	
	@Test
	public void test_whenInputting_theString_MCMXCIX_returnsTheNumber_1999() {
		// Arrange
		String str = "MCMXCIX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(1999,number);
	}
	
	@Test
	public void test_whenInputting_theString_MCMLXXXVI_returnsTheNumber_1986() {
		// Arrange
		String str = "MCMLXXXVI";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(1986,number);
	}
	
	@Test
	public void test_whenInputting_theString_MMMCMXCIX_returnsTheNumber_3999() {
		// Arrange
		String str = "MMMCMXCIX";
		
		// Act
		int number = converter.convertToNumber(str);
		
		// Assert
		assertEquals(3999,number);
	}
	
	@Test
	public void test_toRoman_whenInput_0_return_theEmptyString() {
		
		String output = converter.toRoman(0);
		
		assertEquals("",output);
	}

	@Test
	public void test_toRoman_whenInput_1_return_theString_I() {

		String output = converter.toRoman(1);
		
		assertEquals("I",output);
	}
	
	@Test
	public void test_toRoman_whenInput_2_return_theString_II() {
		
		String output = converter.toRoman(2);
		
		assertEquals("II",output);
	}
	
	@Test
	public void test_toRoman_whenInput_3_return_theString_III() {

		String output = converter.toRoman(3);
		
		assertEquals("III",output);
	}
	
	@Test
	public void test_toRoman_whenInput_4_return_theString_IV() {

		String output = converter.toRoman(4);
		
		assertEquals("IV",output);
	}
	
	@Test
	public void test_toRoman_whenInput_5_return_theString_V() {
		
		String output = converter.toRoman(5);
		
		assertEquals("V",output);
	}
	
	@Test
	public void test_toRoman_whenInput_6_return_theString_VI() {
		
		String output = converter.toRoman(6);
		
		assertEquals("VI",output);
	}
	
	@Test
	public void test_toRoman_whenInput_7_return_theString_VII() {
		
		String output = converter.toRoman(7);
		
		assertEquals("VII",output);
	}
	
	@Test
	public void test_toRoman_whenInput_9_return_theString_IX() {
		
		String output = converter.toRoman(9);
		
		assertEquals("IX",output);
	}

	@Test
	public void test_toRoman_whenInput_10_return_theString_X() {
		
		String output = converter.toRoman(10);
		
		assertEquals("X",output);
	}
	
	@Test
	public void test_toRoman_whenInput_11_return_theString_XI() {
		
		String output = converter.toRoman(11);
		
		assertEquals("XI",output);
	}
	
	@Test
	public void test_toRoman_whenInput_16_return_theString_XVI() {
		
		String output = converter.toRoman(16);
		
		assertEquals("XVI",output);
	}
	
	@Test
	public void test_toRoman_whenInput_39_return_theString_XXXIX() {
		
		String output = converter.toRoman(39);
		
		assertEquals("XXXIX",output);
	}
	
	@Test
	public void test_toRoman_whenInput_40_return_theString_XL() {
		
		String output = converter.toRoman(40);
		
		assertEquals("XL",output);
	}
	

	
	@Test
	public void test_toRoman_whenInput_50_return_theString_L() {
		
		String output = converter.toRoman(50);
		
		assertEquals("L",output);
	}
	
	@Test
	public void test_toRoman_whenInput_90_return_theString_XC() {
		
		String output = converter.toRoman(90);
		
		assertEquals("XC",output);
	}
	
	@Test
	public void test_toRoman_whenInput_100_return_theString_C() {
		
		String output = converter.toRoman(100);
		
		assertEquals("C",output);
	}
	
	@Test
	public void test_toRoman_whenInput_400_return_theString_CD() {
		
		String output = converter.toRoman(400);
		
		assertEquals("CD",output);
	}
	
	@Test
	public void test_toRoman_whenInput_500_return_theString_D() {
		
		String output = converter.toRoman(500);
		
		assertEquals("D",output);
	}
	
	@Test
	public void test_toRoman_whenInput_900_return_theString_CM() {
		
		String output = converter.toRoman(900);
		
		assertEquals("CM",output);
	}
	
	@Test
	public void test_toRoman_whenInput_1000_return_theString_M() {
		
		String output = converter.toRoman(1000);
		
		assertEquals("M",output);
	}
	
	@Test
	public void test_toRoman_whenInput_1986_return_theString_MCMLXXXVI() {
		
		String output = converter.toRoman(1986);
		
		assertEquals("MCMLXXXVI",output);
	}
	
	@Test
	public void test_toRoman_whenInput_3999_return_theString_MMMCMXCIX() {
		
		String output = converter.toRoman(3999);
		
		assertEquals("MMMCMXCIX",output);
	}
}

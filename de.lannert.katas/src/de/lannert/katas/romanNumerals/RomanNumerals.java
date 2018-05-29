package de.lannert.katas.romanNumerals;

public enum RomanNumerals {
	
	I 	(1),
	IV 	(4),
	V 	(5),
	IX 	(9),
	X 	(10),
	XL 	(40),
	L 	(50),
	XC 	(90),
	C 	(100),
	CD 	(400),
	D 	(500),
	CM 	(900),
	M 	(1000);
	
	RomanNumerals(int value) {
		this.value = value;
	}
	
	private int value;
	
	public int getValue() {
		return value;
	}

}

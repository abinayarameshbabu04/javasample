package com.tnsif.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int - 4bytes
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("\nMinint range of byte is" +
				minInt+"\nMaxint range of byte is "+maxInt);
		
		//long - 8bytes
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("\nMinlong range of byte is" +
				minLong+"\nMaxlong range of byte is "+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("\nfloat value is "+f+" \ndouble value is "+d);
		
		//boolean 
		boolean flag=false;
		System.out.println("\nboolean value is "+flag);
	}

}

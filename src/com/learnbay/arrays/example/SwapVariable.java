package com.learnbay.arrays.example;
/*
 * Input : a = 10, b = 20 and c = 30
 * Output : a = 30, b = 10 and c = 20
 */
public class SwapVariable {
	
	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		
		//Approch -1
		/*a = a + b + c; //60
		b = a - (b+c);//10
		c = a - (c+b); //20
		a = a - (b+c); //30
*/		
		//Approch -2
		a = a ^ b ^ c;
		b = a ^ b ^ c;
		c = a ^ b ^ c;
		a = a ^ b ^ c;
		
		System.out.println("a =" +a+" b ="+b+" c ="+c);
	}

}

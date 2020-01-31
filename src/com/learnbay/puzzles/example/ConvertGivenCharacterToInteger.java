package com.learnbay.puzzles.example;

/*
 * 
"-88297 248252140B12 37" => -88297
"75 6 " => 75
"+349A756" . => 349
 */
public class ConvertGivenCharacterToInteger {
	
	public static void main(String[] args) {
		System.out.println(convertCharacterToInteger("-88297 248252140B12 37"));
		System.out.println(convertCharacterToInteger("75 6 "));
		System.out.println(convertCharacterToInteger("+349A756"));
	}
	
	private static Integer convertCharacterToInteger(String str) {
		
		StringBuilder sb = new StringBuilder();
		if(str != null && !str.isEmpty()) {
			for (int i=0;i<str.length();i++) {
				if(i == 0 && str.charAt(i) == '-' || str.charAt(i) == '+') {
					if (str.charAt(i) == '-' )
						sb.append("-");
					continue;
				}
				int num = str.charAt(i) - '0';
				if (num>=0 && num <= 9) {
					sb.append(str.charAt(i));
				} else {
					break;
				}
			}
		}
		
		return Integer.parseInt(sb.toString());
	}

}

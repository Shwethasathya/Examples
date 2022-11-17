
//count number of vowels and consonents in the string

package com.xworkz.basicprograms.programs;

public class Count {

	public static void main(String[] args) {

		String str = "Mobile is a android";
		int vowelsCount = 0;
		int consonenetsCounts = 0;

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' '){
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')

				vowelsCount++;
		}else{
			consonenetsCounts++;
		}
	    }
	}
	System.out.println(vowelsCount);
	System.out.println(consonentsCounts);
			
	}
}

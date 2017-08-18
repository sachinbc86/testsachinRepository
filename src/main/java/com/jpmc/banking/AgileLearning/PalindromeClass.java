package com.jpmc.banking.AgileLearning;

public class PalindromeClass {
	
	public static boolean isPalindrome(String input) {
		
		boolean output = false;
		String temp = "";
		
	 if(input != null && input != "") {
	      int length = input.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         temp = temp + input.charAt(i);
	 
	      if (input.equals(temp)) {
	    	  output = true;
	         System.out.println("Entered string is a palindrome.");
	      }else {
	         System.out.println("Entered string is not a palindrome.");
	 
	   }
	 }
		return output;
	}
	
/*	public static boolean isNotPalindrome(String input) {
		
		boolean output = true;
		String temp = "";
		
	 if(input != null && input != "") {
	      int length = input.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         temp = temp + input.charAt(i);
	 
	      if (!input.equals(temp)) {
	    	  output = false;
	         System.out.println("Entered string is not palindrome.");
	      }else {
	         System.out.println("Entered string is  a palindrome.");
	 
	   }
	 }
		return output;
	}*/
	

}

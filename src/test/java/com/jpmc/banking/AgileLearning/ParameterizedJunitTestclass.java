package com.jpmc.banking.AgileLearning;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)

public class ParameterizedJunitTestclass {
	
	 @Parameters(name="{0} is palindrome test?c= {1}")
	 public static Collection<Object[]> data(){
		 return Arrays.asList(new Object[][]{{"madam",true},{"not a palindrome" ,false},{null,false},{"",false}});
		 
	 }
	 //acomment
	 @Parameter(0)
	 public String input;
	 @Parameter(1)
	 public boolean expected;
	 
	 @Test
	 public void isPalindromTest() {
		 System.out.println("test");
		 assertThat(PalindromeClass.isPalindrome(input),is(expected));
	 }
	 
	/* @Test
	 public void isNotPalindrome() {
		assertThat( PalindromeClass.isNotPalindrome(input),is(expected));
	 }
*/
}

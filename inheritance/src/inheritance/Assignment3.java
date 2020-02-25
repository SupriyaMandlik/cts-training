//Assignment 3

package inheritance;

import java.util.Scanner;

public class Assignment3 {

	    static boolean isPalindrome(String str)
	    {
	    	int i = 0, n = str.length() - 1;
	        while (i < n) {
	        	if (str.charAt(i) != str.charAt(n))
	        		return false;
	            i++;
	            n--;
	        }
	        return true;
	    }
	    public static void main(String... args) {
	    	Assignment3 obj = new Assignment3();
	    	String str = null;
	    	Scanner sc = new Scanner(System.in);
	    
	    	str = sc.nextLine();
	    	sc.close();
	    	System.out.println(obj.isPalindrome(str));
	    }
}

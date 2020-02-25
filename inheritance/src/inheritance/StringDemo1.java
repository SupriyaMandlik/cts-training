

package inheritance;
public class StringDemo1 {
	public static void main(String[] args)
	{
		String msg="Global Warming";
	 //	a) To display the last four characters.
		  System.out.println(msg.substring(msg.length()-4 ,msg.length()));
     //  b) To display the substring starting from index 4 and ending at index 8.
			 System.out.println(msg.substring(4,8));
	// c) To check whether string has alphanumeric characters or not.
			  System.out.println(msg.matches("[a-zA-Z0-9]"));
	// d) To trim the last four characters from the string.	  
			  System.out.println(msg.substring(0 ,msg.length()-4));
	//  e) To trim the first four characters from the string.	  
			  System.out.println(msg.substring(4,msg.length()));
	//   f) To display the starting index for the substring "Wa".	  
			  System.out.println(msg.indexOf("Wa"));
	//  g) To change the case of the given string	  
			  System.out.println(msg.toUpperCase());
			  System.out.println(msg.toLowerCase());
	//  h) To check if the string is in title case.	
			  char result = msg.charAt(0);
			  if(msg.charAt(0)<=90 && msg.charAt(0)>=65 ) {
				  System.out.println("String is in title case");
			  }else
			  {
				  System.out.println("String is not in title case");
			  }
			  
	// i) To replace all the occurrences of letter "a" in the string with "*"
			  System.out.println(msg.replaceAll("a","*"));
	}
}

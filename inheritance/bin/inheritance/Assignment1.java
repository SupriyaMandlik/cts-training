//Assignment 1

package inheritance;

public class Assignment1 {

		public static void main(String...args) {
		String s1= new String(" Java programming is easy");
		String s2=new String("India will be 5 trillion USD economy by 2025");
		System.out.println("Return Value :" );      
	    
	    for (String retval: s1.split(" ")) {
	       System.out.println(retval);
	    }

	    for (String retval: s2.split(" ")) {
	       System.out.println(retval); 
	 }
		}
	}


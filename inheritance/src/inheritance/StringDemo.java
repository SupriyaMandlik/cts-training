package inheritance;

public class StringDemo {

		public static void main(String[] args)
		{
			String msg="I am an engineer";
			 String msg1 = "I am an engineer";
			char result = msg.charAt(5);
		    System.out.println(result);
		    int result1 = msg.codePointAt(4);
		    System.out.println(result1);
		    int result2 = msg.codePointBefore(4);
		    System.out.println(result2);
		    int result3 = msg.codePointCount(4, 5);
		    System.out.println(result3);
		    System.out.println(msg.compareTo(msg1));
		    System.out.println(msg1.compareToIgnoreCase(msg1));
		    System.out.println(msg.concat(msg1));
		    System.out.println(msg.contains("I am"));  
		    System.out.println(msg.contentEquals("Engineer"));
		    char[] msg2 = {'H', 'e', 'l', 'l', 'o'};
		    String msg3 = "";
		    msg3 = msg3.copyValueOf(msg2, 0, 5);
		    System.out.println("Returned String: " + msg3);
		    System.out.println(msg.endsWith("r")); 
		    System.out.println(msg.equals(msg1)); 
		    System.out.println(msg.equalsIgnoreCase(msg1));
		    System.out.println(msg.indexOf("e"));
		    System.out.println(msg.substring(4,8));
}}
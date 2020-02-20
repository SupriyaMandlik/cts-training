//Assignment 2

package inheritance;

public class Assignment2 {
	public static void main(String argas[]) {
		
	String str=new String ("Java programming is easy");
			
	 StringBuffer sb=new StringBuffer(str);  
	 for(int i = 0; i < str.length(); i++) {  
         
       
         if(Character.isLowerCase(str.charAt(i))) {  

             sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
         }  
       
         else if(Character.isUpperCase(str.charAt(i))) { 
             sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));  
         }  
     }  
     System.out.println(sb);  
 }  
}  


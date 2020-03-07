package jdbcapi;

public class Test1 {
	public static void main(String...args) {
		String str1="java";
		String str2=new String("java");
		String str3="java";
		String str4=new String("java");
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
	 if(sb1.equals(str2))
	 {
	System.out.println("Equal");	 
	 }else {
		 System.out.println("Not equal");
	 }
	 }

}

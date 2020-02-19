package inheritance;

public class StringBufferDemo {
    public static void main(String...args) {
    
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Hello to Java version 8");
	System.out.println(sb.capacity());
	sb.append("this is my question for development");
	System.out.println(sb.capacity());
	sb.insert(7,"Dear");
	System.out.println(sb);
	sb.replace(7, 20, "SOFTWARE");
	System.out.println(sb);
	sb.delete(7,11);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
}
}

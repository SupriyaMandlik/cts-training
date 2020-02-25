package inheritance;
class StaticDemo
{
	int x=10;
	static int y=20;
	 static public void show()
	 {
		 System.out.println(x);
	 }
}

public class Test1 {
 public static void main(String... agrs) {
	 StaticDemo d= new StaticDemo();
	 StaticDemo d1= new StaticDemo();
	 StaticDemo d2= new StaticDemo();
	 System.out.println(d.x);
	 System.out.println(d.y);
	 d2.x=50;
	 d1.y=30;
	 System.out.println(d.x);
	 System.out.println(d.y);
	 
	 
 }
 
}

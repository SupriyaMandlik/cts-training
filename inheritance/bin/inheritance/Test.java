package inheritance;
import java.util.Scanner;

interface Add
{
	public static final int AGE=20; //public and abstract by default
	  int add(int a,int b);
	  default int mul(int a,int b)  //default and static methods in interfaces which have definitions
	  {
		  return a*b;
	  
	  }
	 
}
interface Sub extends Add
{
	int sub(int a,int b);
}
class Div{
	public int div(int a,int b)
	{ 
		return a/b;
	}
}
 
	class Imp1 extends Div implements Sub
	{
		public int add(int a,int b)
		{
		   return a+b;
		}
		public int sub(int a,int b) {
			if(a>b)
				return a-b;
			else return b-a;
		}
	}

 class Test
 {
	 public static void main(String[] args)
	{
Imp1 imp=new Imp1();
System.out.println(imp.add(2, 3));
System.out.println(imp.sub(8, 10));
System.out.println(imp.div(8, 4));
System.out.println(imp.mul(8, 10));


	}
 }
 


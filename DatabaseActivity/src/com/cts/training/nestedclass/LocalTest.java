package com.cts.training.nestedclass;

public class LocalTest {
		public static void main(String[] args) {
			
			LInner li=new LInner();
			li.display();
		}

	}
	class LInner
	{
		
	   public void display()
	   {
		   
		   class Local
		   {
			   public void sayHi()
			   {
				   System.out.println("Hello I am Local Inner Class");
			   }
		   }
		   Local l= new Local();
		   l.sayHi();
	   }
	}


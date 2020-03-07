package com.cts.training.nestedclass;

public class StaticInner {
	public static void main(String[] args) {
		
			SInner.Inner sInner= new SInner.Inner();
			sInner.display();
		}
	}

	class SInner
	{
		static int age=20;
	   static class Inner
	   {
		   public void display()
		   {
			   System.out.println("Static Age :"+age);
			  
		   }
	   }
	}


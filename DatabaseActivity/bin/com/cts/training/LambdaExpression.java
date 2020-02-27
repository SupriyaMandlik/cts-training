package com.cts.training.Arrays;

public class LambdaExpression {
	public static void main(String args[]) {
	/*	MyThread t=new MyThread();
		Thread thread=new Thread(t);
		thread.start();*/
		
		//Runnable r=() -> System.out.println("hello runnable");
		//Thread t=new Thread(r);
		//t.start();
		
		Hello add=(a,b) -> a+b;
		System.out.println(add.Calculate(4, 5));
		Hello sub=(a,b) -> a-b;
		System.out.println(sub.Calculate(9,5));
		Hello mul=(a,b) -> a*b;
		System.out.println(mul.Calculate(4, 5));
		Hello div=(a,b) -> a/b;
		System.out.println(div.Calculate(8, 2));
	}

}
@FunctionalInterface
interface Hello             /*functional interface should contain only one 
                                   only one method*/
{
	double Calculate(double a,double b);
}
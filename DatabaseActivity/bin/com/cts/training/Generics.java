package com.cts.training.Arrays;

public class Generics <T> {
   private T obj;
   public T get()
   {
	   return obj;
   }
   public void set(T obj) {
	   this.obj=obj;
   }
   class Test{
     public void main(String[] args)
   {
    	 Generics<String> g= new Generics<>();
			g.set("Supriya"); 
			System.out.println(g);
			Generics<Integer> g1= new Generics<>();
			g1.set(5);
			System.out.println(g1);	
		}
	}
   }


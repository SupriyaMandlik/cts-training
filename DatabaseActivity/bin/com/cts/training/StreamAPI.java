package com.cts.training.Arrays;

import java.util.ArrayList;

public class StreamAPI {
	public static void main(String args[]){  
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		list.add(20);  
         list.add(40);  
         list.add(35);
         list.add(80);
         list.add(62);
         for(int i=0; i<list.size(); i++)
 			if(list.get(i)%2==0 && list.get(i)%5==0)
 				list1.add(list.get(i));
       System.out.println(" the elements divisible by 2 and 5 are");
 		System.out.println(list1);

 		System.out.println("Double of the elements: ");
 		for(int i=0; i<list.size(); i++)
 			list2.add(list.get(i)*2);
 		System.out.println(list2);

		
	}   	
	}
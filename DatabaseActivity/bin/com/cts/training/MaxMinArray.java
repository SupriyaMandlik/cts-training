/*5. Write a program in C to find the maximum and minimum element in an array. 

Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 */

package com.cts.training.Arrays;

public class MaxMinArray {
	public static void main(String args[])
	   {
	   int arr[]= {45,25,21};
	   int max=arr[0];
	   int min=arr[0];
	   
	   for(int i=0;i<arr.length;i++) {
		   if(max<arr[i]) {
			   max=arr[i];
		   }else if (min>arr[i]) {
			   min=arr[i];
		   }
		   
		   }
	   System.out.println("Maximum element is :"+max);
	   System.out.println("Minimum element is :" +min);
	   }
	
}

/*3. Write a program in C to copy the elements of one array into another array.

Test Data : 
 Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 */

package com.cts.training.Arrays;

public class ArrayCopy {
	public static void main(String args[])
	   {
	   int arr1[]= {15,10,12};
	   int arr2[]=new int[arr1.length];
	   for(int i=0;i<arr1.length;i++) {
		   arr2[i]=arr1[i];
	   }
	   System.out.println("The elements stored in the first array are : ");
	   for(int i=0;i<arr1.length;i++) {
 System.out.println(""+arr1[i]);
	   }
	   System.out.println("The elements stored in the first array are :");
	   for(int i=0;i<arr1.length;i++) {
		   System.out.println(""+arr2[i]);  
	   }
	   }	   
}
	

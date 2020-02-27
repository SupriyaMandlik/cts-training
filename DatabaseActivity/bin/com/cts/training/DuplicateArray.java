/*4. Write a program in C to count a total number of duplicate elements in an array.

Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element - 2 : 1 
Expected Output : 
Total number of duplicate elements found in the array is : 1 */



package com.cts.training.Arrays;

public class DuplicateArray {
	public static void main(String args[])
	   {
	   int arr[]= {5,1,1};
for(int i=0;i<arr.length;i++) {
	for (int j=i+1;j<arr.length;j++) {
		if(arr[i]==(arr[j])) {
			System.out.println("Total number of duplicate elements found in the array is :"+arr[j]);
		}
	}
		 
	 }
		   
	   }

}

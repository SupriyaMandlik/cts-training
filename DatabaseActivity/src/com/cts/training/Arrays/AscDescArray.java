/*7. Write a program in C to sort elements of array in ascending order.

Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9
*/
package com.cts.training.Arrays;

public class AscDescArray {
	public static void main(String args[])
	   {
	   int arr[]= {2,7,4,5,9};
	   
	   for(int i=0;i<arr.length;i++) {
		   for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>(arr[j])) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
     }
}
	   System.out.println("Elements of array in sorted ascending order:");
       for (int i = 0; i < arr.length- 1; i++) 
       {
           System.out.print(arr[i] + ", ");
       }
       System.out.print(arr[arr.length - 1]);
   }

	   }
	   

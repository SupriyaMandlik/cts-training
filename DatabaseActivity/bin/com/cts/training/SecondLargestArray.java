/*8. Write a program in C to find the second largest element in an array.

Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 */

package com.cts.training.Arrays;

public class SecondLargestArray { 
		public static void main(String[] args) {
	 
			int arr[] = { 2,9,1,4,6};
			int largest = arr[0];
			int secondLargest = arr[0];
			for (int i = 0; i < arr.length; i++) {
			}
			for (int i = 0; i < arr.length; i++) {
	 
				if (arr[i] > largest) {
					secondLargest = largest;
					largest = arr[i];
	 
				} else if (arr[i] > secondLargest) {
					secondLargest = arr[i];
	 
				}
			}
	 
			System.out.println("Second largest element in the array is :" + secondLargest);
	 
		}
	}



package com.cts.training.Arrays;
import java.util.Scanner;
public class Operations2DArray {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input elements to store in the array :");
			int Elements = sc.nextInt();
			int[][] arr = new int[Elements][Elements];
			for (int i = 0; i <Elements; i++) {
				for (int j = 0; j < Elements; j++) {
					System.out.println((j+1)+" element of "+(i+1)+" row is: ");
					arr[i][j] = sc.nextInt();
				}
			}
			sumRows(arr,Elements);
			sumColumns(arr,Elements);
			sumDiagonals(arr, Elements);
		    divisibleBy(arr, Elements);
			sc.close();
		}
	
		public static void sumRows(int[][] arr, int Elements) {
			int sum = 0;
			for (int i = 0; i < Elements; i++) {
				for (int j = 0; j < Elements; j++) {
					sum += arr[i][j];
				}
				System.out.println("\nSum of "+(i+1)+" row is: "+sum);
			}
		}
		public static void sumColumns(int[][] arr, int Elements) {
			int sum = 0;
			for (int i = 0; i < Elements; i++) {
				for (int j = 0; j < Elements; j++) {
						sum += arr[j][0];
			}
			System.out.println("\nSum of "+(i+1)+" column is: "+sum);
			}
		}
		public static void sumDiagonals(int[][] arr, int Elements) {
			int sum = 0;
			for (int i = 0; i < Elements; i++) {
				for (int j = 0; j < Elements; j++) {
					if(i==j)
						sum += arr[i][j];
				}
			}
			System.out.println("\nSum of diagonal elements is: "+sum);
		}

		public static void divisibleBy(int[][] arr, int Elements) {
			int sum = 0;
			for (int i = 0; i < Elements; i++) {
				for (int j = 0; j < Elements; j++) {
					if(arr[i][j]%2==0 && arr[i][j]%3==0)
						sum += arr[i][j];
					else
						continue;
				}
			}
			System.out.println("\nSum of elements divisible by 2 & 3 is: "+sum);
		}
	}

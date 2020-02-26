
package jdbcapi;

import java.util.Scanner;

public class DaphneArray {
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the elements of a string");
		 int length=sc.nextInt();
		 int []arr=new int[length];
		 for(int i=0;i<length;i++)
		 {
			arr[i]=sc.nextInt(); 
		 }
	 } 
}
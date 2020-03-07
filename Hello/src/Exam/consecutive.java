package Exam;

import java.util.Scanner;

public class consecutive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int originalNumber = sc.nextInt();

		int tensPlace, unitsPlace, difference;
		tensPlace = originalNumber/10;
		unitsPlace = originalNumber%10;

		if(tensPlace > unitsPlace)
			difference = tensPlace - unitsPlace;
		else
			difference = unitsPlace - tensPlace;

		System.out.println("Difference: " + difference);
		System.out.println("Final number: ");

		String str1 = Integer.toString(difference);
		String str2 = Integer.toString(unitsPlace);

		System.out.println(str1 + str2);
	}
}
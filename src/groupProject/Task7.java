package groupProject;

import java.util.Scanner;

public class Task7 {
//Write a java program to check whether a given
	// number is prime or not?
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();

		if (num % 2 != 0 || num == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}

}

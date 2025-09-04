package com.intermediate;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of 1st number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter value of 2nd number: ");
		int number2 = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if (str.isEmpty()) {
			str = null;
		}

		try {
			if (number2 == 0) {
				throw new ArithmeticException("Division by zero error");
			}

			int result = number1 / number2;
			System.out.println("Result of a/b: " + result);
			// intentionally thrown exception
			if (str == null) {
				System.out.println("Length of string: " + str.length());
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: ");
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointer Exception: " + e.getMessage());
		} finally {
			System.out.println(" thank you  ");
			sc.close();
		}

		System.out.println("This program demonstrates exceptions");

	}
}

package com.basic;

import java.util.Scanner;

public class AreaCalculator {
	static final double PI = 3.14159;

	static double circleArea(double radius) {
		return PI * radius * radius;
	}

	static double squareArea(double side) {
		return side * side;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Shape: 1.Circle  2.Square");
		int choice = sc.nextInt();

		double area = 0;
		switch (choice) {
		case 1:
			System.out.print("Enter radius: ");
			double r = sc.nextDouble();
			area = circleArea(r);
			break;

		case 2:
			System.out.print("Enter side: ");
			double s = sc.nextDouble();
			area = squareArea(s);
			break;

		default:
			System.out.println("Invalid choice!");
			break;
		}
		sc.close();
		System.out.println("Area = " + area);
	
	}

}


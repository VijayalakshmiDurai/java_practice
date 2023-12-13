/**

 * 
 * Open your IntelliJ Idea IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the result of the operations.
Print out the results of the two operations in the console.
 */
package VariableNamingypeCasting;

import java.util.Scanner;

/**
 * 
 */
public class CircleCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the diameter of the circle");
		double diameter = scanner.nextInt();
		double radius =  diameter/2;
		
		double area =  (3.14*(radius*radius));
		
		double diameter1 = radius*2;
		System.out.println(area);
		System.out.println(diameter1);
	}

}

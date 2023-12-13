//Create a Java program that tells whether your body to weight ratio is good or could be better.
//The java app should take in your weight and height from the console and calculate your body to weight ratio.
//You can use this article as a standardized guide for how to apply the logic.

package logic_Operators;

import java.util.Scanner;

public class BodyWeightRatioCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

       
        double bmi = weight/(height*height);

     
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Body Weight Ratio: Underweight (better)");
        } else if (bmi < 24.9) {
            System.out.println("Body Weight Ratio: Normal Weight (good)");
        } else if (bmi < 29.9) {
            System.out.println("Body Weight Ratio: Overweight (better)");
        } else {
            System.out.println("Body Weight Ratio: Obese (better)");
        }

        scanner.close();
    }
}

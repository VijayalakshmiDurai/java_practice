//Create a new Java class that will have the following functionality:
//
//Name should be CalculatorBrain
//Implement a function for each aritmetic operation
//Addition
//Subtraction
//Multiplication
//Division
//Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.

package functions;

public class CalculatorBrain {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; 
        }
    }

   

    public static void main(String[] args) {
        
        double result = addition(5, 3);
        System.out.println("Addition Result: " + result);

        double result1 = subtraction(8, 4);
        System.out.println("Subtraction Result: " + result);

        double result2 = multiplication(2.5, 6);
        System.out.println("Multiplication Result: " + result);

        double result3 = division(10, 2);
        System.out.println("Division Result: " + result);
    }
}

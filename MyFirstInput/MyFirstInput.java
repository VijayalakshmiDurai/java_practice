/** 
 * JAVA-3 Variables, Data Types and Operators - My First Input
 */
package MyFirstInput;

import java.io.Console;

/**
 * 
 */
public class MyFirstInput {
	public static void main(String[] args) {
		Console console =System.console();
		System.out.println("Enter Your Name");
		String name = console.readLine();
		   System.out.println("My name is "+ name);

	}

}
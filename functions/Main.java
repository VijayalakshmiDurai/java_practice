//Download the project and import it into IntelliJ Idea
//Implement the following functions:
//    private static void printNameLength( String name )
//    {
//      //TODO implement this code
//    }
//
//    private static void printNameCharacters( String name )
//    {
//      //TODO implement this code
//    }
//Test your code with 5 different names and verify that the behaviour is correct.
//Modify your code to also capture from the user the last name.
//Implement an additional function that prints the FUll name of the person.
package functions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = console.next();
        System.out.println("Enter your last name: ");
        String lastName = console.next();

        printNameCharacters(firstName);
        printNameLength(firstName);
        printFullName(firstName, lastName);

        console.close();
    }

    private static void printNameLength(String name) {
        System.out.println("Name length: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.print("Name characters: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
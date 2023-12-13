//A movie cinema does price discounting depending on a customer's age.
//The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
//Age range	Ticket Price
//Normal ticket	7 Euros
//Below 5	      60% Discount
//Over 60	    55% Discount
//Write the app so that the conditions above are met and the correct ticket price is returned.

package ControlFlow;

import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int numTickets = 0;
        
        float ticket_price = 7.0f;
        
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else if (age > 5 && age < 60) {
            System.out.print("Enter the number of tickets you wish to buy: ");
            numTickets = scanner.nextInt();
            if (numTickets >= 2) {
                float discountAmount = (numTickets * ticket_price * 30) / 100;
                float totalCost = (numTickets * ticket_price) - discountAmount;
                System.out.println("Your Price with a 30% discount is: " + totalCost);
            } else {
                System.out.println("Your Price is " + (numTickets * ticket_price));
            }
        } else if (age <= 5) {
            System.out.println("Your Price is " + (ticket_price - (ticket_price * 0.55)));
        } else if (age >= 60) {
            System.out.println("Your Price is " + (ticket_price - (ticket_price * 0.60)));
//        } else {
//            if (numTickets >= 2) {
//                float discountAmount = (numTickets * ticket_price * 30) / 100;
//                float totalCost = (numTickets * ticket_price) - discountAmount;
//                System.out.println("Your Price with a 30% discount is: " + totalCost);
//            } else {
//                System.out.println("Your Price is " + (numTickets * ticket_price));
//            }
        }
		
			
	}

}

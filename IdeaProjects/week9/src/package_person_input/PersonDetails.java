package package_person_input;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[]args) {

        // Create object named customer

        Person customer;
        customer = new Person();

        // !! NEED TO ENTER VARIABLE INFORMATION !!
        int states = 0;
        double stateAdjustment= 0;
        double ageAdjustment = 0;
        double demeritAdjustment = 0;

        System.out.println("Please enter your name");
            // Type Scanner to import Scanner library
            // input is our variable
            // new Scanner is assigned to our variable
            // System is the class, in indicates user input
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender using M or F or N");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your five digit zip code");
        customer.zipCode = input.next();

        System.out.println("Please provide your credit score");
        customer.creditScore = input.nextInt();

        System.out.println("Provide TRUE if you have traffic violations and FALSE if not.");
        customer.violations = input.nextBoolean();

        if(customer.violations) {
            System.out.println("Enter TRUE if you have a DUI on record, FALSE if not.");
            customer.violationDUI = input.nextBoolean();

            System.out.println("Enter TRUE if you have a red light infraction on record, FALSE if not.");
            customer.violationRedLight = input.nextBoolean();

            System.out.println("Enter TRUE if you have a speeding infraction on record, FALSE if not.");
            customer.violationRedLight = input.nextBoolean();

        } // end if

        System.out.println("Thank you for completing this form");
        customer.display();

            // customer is our object
            // identifyRegion is the method I am calling
            // states is the variable returned by that method
            // I must declare the states variable here so that it exists outside the method and can be called
        System.out.println(customer.identifyRegion(states));
        System.out.println("Regional adjustment: $"+customer.californiaRegion(stateAdjustment));

        System.out.println("Age adjustment: "+customer.ageCategory(ageAdjustment));
        System.out.println("Violation and credit score adjustment: "+customer.demeritRate(demeritAdjustment));

        System.out.println("Your monthly premium");
    }
}

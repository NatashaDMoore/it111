import java.util.Scanner;

public class DailySpecialsExpanded {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);


            // allows while loop to start

        boolean weekday = false;
        String specials;
        String coffee = "";
        double price = 0;
        int quantity = 0;


            // Initial prompt

        System.out.println("Please enter a weekday (Monday - Friday only).");


        while (!weekday) {

            // If != weekday, loop will continue
            
            specials = input.next();


                switch (specials) {

                    case "Monday" -> {
                        coffee = "latte";
                        price = 4.95;
                    }

                    case "Tuesday" -> {
                        coffee = "frap";
                        price = 5.95;
                    }

                    case "Wednesday" -> {
                        coffee = "Cappuccino";
                        price = 4.35;
                    }

                    case "Thursday" -> {
                        coffee = "Drip";
                        price = 2.95;
                    }

                    case "Friday" -> {
                        coffee = "Espresso";
                        price = 3.95;
                    }

                    default -> System.out.println("You have entered an invalid day. Please enter a weekday (Monday - Friday)");


                } //end switch


// Define weekday to trigger quantity input and pricing


            weekday =   specials.equals("Monday") || 
                        specials.equals("Tuesday") || 
                        specials.equals("Wednesday") || 
                        specials.equals("Thursday") || 
                        specials.equals("Friday");


// Calculate price for quantity input

            if(weekday) {

                System.out.println(specials + "'s cafe du jour is an " + coffee + " for $" + price);
                System.out.println("How many " + coffee + "s would you like to order?");
                quantity = input.nextInt();


                if (quantity == 0) {
                    System.out.println("No " + coffee + "? Bummer!");


                } else if (quantity == 1) {
                    System.out.println("Great! We will start making your " + coffee + " for you now. It will cost $" + price + ".");


                } else if (quantity >= 2 && quantity <= 4) {
                    System.out.print(quantity + " " + coffee + "s coming right up. Your total will be $");
                    System.out.printf("%.2f", price * quantity);


                } else if (quantity >= 5 && quantity < 10) {
                    System.out.print(quantity + " " + coffee + "s coming right up. You qualify for our group discount of 10%! Your total will be $");
                    System.out.printf("%.2f", price * quantity * 0.9);
                    System.out.print(".");
                    System.out.print("You saved $");
                    System.out.printf("%.2f", price * quantity * 0.1);
                    System.out.print(" today.");


                } else {
                    System.out.print(quantity + " " + coffee + "s coming right up. You qualify for our group discount of 20%! Your total will be $");
                    System.out.printf("%.2f", price * quantity * 0.8);
                    System.out.print(".");
                    System.out.println();
                    System.out.print("You saved $");
                    System.out.printf("%.2f", price * quantity * 0.2);
                    System.out.print(" today.");

                } // end if


// Completion note


                System.out.println();
                System.out.println("Thanks for coming to the Intro To Java Stand. Have a caffeinated day!");

                break;

            } // end if

        } // end while

    } // end main
}

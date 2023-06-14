import java.util.Scanner;

public class DailySpecialsExpanded {

    public static void main(String[] arg) {

        String specials;

        Scanner input = new Scanner(System.in);                                 // This line accesses the Scanner library and allows for the user to input data

        System.out.println("Please enter a weekday (Monday - Friday only).");

        specials = input.next();                                              //assigning input to specials

        //input.close();                                                        // no longer asking for input past this point. Closes the input.

//--------------------------------------------------------------------
//      COFFEE
//--------------------------------------------------------------------

        String coffee = "";
        double price = 0;
        int quantity = 0;

        // declare boolean for error
        // Write boolean class if else statement
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        // if statement for weekend entry

        if (saturday || sunday) {                                                // || means or
            System.out.println("Please enter a weekday (Monday - Friday)");     // error message if true
            specials = input.next();                                            // only if sat/sun is true, user is allowed to input specials again.
        }


        while(!saturday && !sunday) {

            switch (specials) {

                // Cases will be the day of the week

                case "Monday" -> {                       // COLON!
                    coffee = "latte";
                    price = 4.95;
                    System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    quantity = input.nextInt();
                }
                case "Tuesday" -> {                      // COLON!
                    coffee = "frap";
                    price = 5.95;
                    System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    quantity = input.nextInt();
                }
                case "Wednesday" -> {                    // COLON!
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    quantity = input.nextInt();
                }
                case "Thursday" -> {                     // COLON!
                    coffee = "Drip";
                    price = 2.95;
                    System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    quantity = input.nextInt();
                }
                case "Friday" -> {                       // COLON!
                    coffee = "Espresso";
                    price = 3.95;
                    System.out.println(specials + "'s cafe du jour is an " + coffee + " for $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    quantity = input.nextInt();
                }

            } //end switch




            if (quantity <= 0) {
                System.out.println("No " + coffee + "? Bummer!");
            } else if (quantity == 1) {
                System.out.println("Great! We will start making your " + coffee + " for you now. It will cost $" + price + ".");
            } else {
                System.out.print(quantity + " " + coffee + "s coming right up. Your total will be $");
                System.out.printf("%.2f", price * quantity);
                System.out.print(".");
                System.out.println();
            }

        System.out.println("Thanks for coming to the Intro To Java Stand. Have a caffeinated day!");

        } // end while

    } // end main
}

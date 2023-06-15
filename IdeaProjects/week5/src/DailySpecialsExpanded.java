import java.util.Scanner;

public class DailySpecialsExpanded {

    public static void main(String[] arg) {


        Scanner input = new Scanner(System.in);

        String specials;
        String coffee = "";
        double price = 0;
        int quantity = 0;

    // -------- OLGA ---------
        // I'm not sure how to create this boolean without initializing specials
        // Also not sure how to create one boolean with two objects (Saturday and Sunday)

        boolean wrongDay = specials.equals("Sunday");

    // Old booleans
        // boolean saturday = specials.equals("Saturday");
        // boolean sunday = specials.equals("Sunday");

        System.out.println("Please enter a weekday (Monday - Friday only).");
        //specials = input.next();


        while (wrongDay) {

            specials = input.next();

            System.out.println("You have entered a weekend. Please enter a weekday (Monday - Friday)");


            if (!wrongDay) {
                switch (specials) {

                    // Cases will be the day of the week

                    case "Monday" -> {
                        coffee = "latte";
                        price = 4.95;
                        System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");
                        quantity = input.nextInt();
                    }
                    case "Tuesday" -> {
                        coffee = "frap";
                        price = 5.95;
                        System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");
                        quantity = input.nextInt();
                    }
                    case "Wednesday" -> {
                        coffee = "Cappuccino";
                        price = 4.35;
                        System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");
                        quantity = input.nextInt();
                    }
                    case "Thursday" -> {
                        coffee = "Drip";
                        price = 2.95;
                        System.out.println(specials + "'s cafe du jour is a " + coffee + " for $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");
                        quantity = input.nextInt();
                    }
                    case "Friday" -> {
                        coffee = "Espresso";
                        price = 3.95;
                        System.out.println(specials + "'s cafe du jour is an " + coffee + " for $" + price);
                        System.out.println("How many " + coffee + "s would you like to order?");
                        quantity = input.nextInt();
                    }

                } //end switch


                if (quantity <= 0) {
                    System.out.println("No " + coffee + "? Bummer!");
                    System.out.println();

                } else if (quantity == 1) {
                    System.out.println("Great! We will start making your " + coffee + " for you now. It will cost $" + price + ".");
                    System.out.println();

                } else if (quantity > 1 && quantity < 10) {
                    System.out.print(quantity + " " + coffee + "s coming right up. You qualify for our group discount of 10%! Your total will be $");
                    System.out.printf("%.2f", price * quantity * 0.9);
                    System.out.print(".");
                    System.out.println("You saved $");
                    System.out.printf("%.2f", price * quantity * 0.1);
                    System.out.println(" today.");
                    System.out.println();

                } else {
                    System.out.print(quantity + " " + coffee + "s coming right up. You qualify for our group discount of 20%! Your total will be $");
                    System.out.printf("%.2f", price * quantity * 0.8);
                    System.out.print(".");
                    System.out.println();
                    System.out.println("You saved $");
                    System.out.printf("%.2f", price * quantity * 0.2);
                    System.out.println(" today.");
                    System.out.println();

                }
                System.out.println("Thanks for coming to the Intro To Java Stand. Have a caffeinated day!");

            } // end if

        } // end while

    } // end main
}

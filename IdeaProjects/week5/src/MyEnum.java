// enums can be placed outside a class, like this

import java.util.Scanner;

public class MyEnum {

// enums can be placed inside a class, like this

    enum WhoWins {HOME, VISITOR, NEITHER}
    // WhoWins is a type and HOME, VISITOR, and NEITHER are variables.
    // WhoWins.HOME is an object.

    public static void main(String[] arg) {
// this is our method. Enums cannot be placed inside a method.

    WhoWins who;

    int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Seahawks final score.");
            seahawks = input.nextInt();

        System.out.println("Enter Broncos final score.");
            broncos = input.nextInt();

        if(seahawks > broncos) {

            who = WhoWins.HOME;         // WhoWins.Home is an object of the WhoWins type
            System.out.println("The "+who+" team won!");
            System.out.print("Seahawks win by ");
            System.out.print(seahawks - broncos+" points");

        } else if(broncos > seahawks) {

            who = WhoWins.VISITOR;
            System.out.println("The "+who+" team won!");
            System.out.print("Broncos win by ");
            System.out.print(broncos - seahawks+" points..");

        } else {

            who = WhoWins.NEITHER;
            System.out.println(who+" team won.");
            System.out.println("The teams tied with a score of "+seahawks+" points each.");

        }




    }
}

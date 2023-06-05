import java.util.Scanner;

public class TryCatchInt {
    public static void main(String[]args){

        System.out.println("Please enter a number");

        // I am trying the code in the try block
        try{

            int i;

            Scanner input = new Scanner(System.in);

            // When someone enters their integer it will be assigned to i
            i = input.nextInt();

            System.out.println("Your integer is: " + i);

        // If something is wrong it will display in the catch block
        } catch(Exception e) {

            System.out.println("An error occurred: " + e);

        }

    }
}

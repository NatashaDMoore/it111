package package_person;

public class Person {
    // This file does not have a main method
    // We will list our variables here for use in other files

    // -----------------------------------------------------------
    //      Variables
    // -----------------------------------------------------------

    String name;
    char gender;
    int age;
    String car;
    int carYear;
    int creditScore;
    boolean violations;

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Ade: "+age);
        System.out.println("Car: "+car);
        System.out.println("Car Year: "+carYear);
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Violations: "+violations);

        System.out.println();

    } // end display

// New method for our LOGIC
// Data type output will be "double" for our rate
// Inside parenthesis will be our parameter and its date type (double monthlyRate)
    public double getRate(double monthlyRate){

        if(violations && creditScore <=700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }

        // This method requires a return to complete without error
        // Return completes the if else so that it can be called elsewhere

        return monthlyRate;

    } // end getRate


    public double assumeGender(double adjustedRate) {

         if(gender == 'M' && age <= 25) {
             adjustedRate = 100.00;

         } else {
             adjustedRate = 0;

         }

         return adjustedRate;


    } //end assumeGender

    public double assumeCar(double adjustedRate2) {

        if(carYear <= 2010) {
            adjustedRate2 = 0;

        } else {
            adjustedRate2 = 200.00;

        }

        return adjustedRate2;

    } // end assume car



} // end main

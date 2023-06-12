package package_person;

public class PersonDetails {

    // Will print data in this file
    // Will reference the variables in the Person file within the package
    // This file needs a method

    public static void main(String[]args) {

        // Here we create our object

        // Grab the class of Person and call it out in this file
        // Then create a variable of that class (firstPerson)

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

        // We are in the process of creating an object from my Person class
        // firstPerson is an object, and we create it below.

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        // We will now assign values to the variables that belong to our objects

        firstPerson.name = "Calie";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.creditScore = 690;
        firstPerson.violations = false;
        firstPerson.car = "Volkswagen Beetle";
        firstPerson.carYear = 1980;


        secondPerson.name = "Otis";
        secondPerson.gender = 'M';
        secondPerson.age = 21;
        secondPerson.creditScore = 640;
        secondPerson.violations = true;
        secondPerson.car = "Ford Mustang";
        secondPerson.carYear = 2020;


        thirdPerson.name = "Natasha";
        thirdPerson.gender = 'F';
        thirdPerson.age = 20;
        thirdPerson.creditScore = 680;
        thirdPerson.violations = true;
        thirdPerson.car = "Toyota Prius";
        thirdPerson.carYear = 2012;

        // We are calling variables from the Person.java file that have not been defined in this file
        // We must therefore define the variable before use.
        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRate2 = 0;


        firstPerson.display();
        // Now print the getRate method for firstPerson
        // We want to return the monthlyRate variable within the getRate method
        System.out.println("Preliminary Rate: $"+firstPerson.getRate(monthlyRate));
        System.out.println("Adjustment to Rate: $"+firstPerson.assumeGender(adjustedRate));
        System.out.println("Adjustment to Rate: $"+firstPerson.assumeCar(adjustedRate2));

        System.out.print(firstPerson.name+"'s total monthly rate: $");
        System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate) + firstPerson.assumeCar(adjustedRate2));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate: $"+secondPerson.getRate(monthlyRate));
        System.out.println("Adjustment to Rate: $"+secondPerson.assumeGender(adjustedRate));
        System.out.println("Adjustment to Rate: $"+secondPerson.assumeCar(adjustedRate2));
        System.out.print(secondPerson.name+"'s total monthly rate: $");
        System.out.println(secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate) + secondPerson.assumeCar(adjustedRate2));
        
        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate: $"+thirdPerson.getRate(monthlyRate));
        System.out.println("Adjustment to Rate: $"+thirdPerson.assumeGender(adjustedRate));
        System.out.println("Adjustment to Rate: $"+thirdPerson.assumeCar(adjustedRate2));
        System.out.print(thirdPerson.name+"'s total monthly rate: $");
        System.out.println(thirdPerson.getRate(monthlyRate) + thirdPerson.assumeGender(adjustedRate) + thirdPerson.assumeCar(adjustedRate2));







    }
}

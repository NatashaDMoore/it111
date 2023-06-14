package package_person_input;

public class Person {

    // No main method
    // Create the fields/variables

    String name;
    char gender;
    int age;
    double baselineRate = 200;
    String zipCode;
    int cityCode;
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScore;

    // Create a print method

    public void display() {
        System.out.println("Your Information:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Zip Code: "+zipCode);
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Baseline Rate: "+baselineRate);
        System.out.println();
        System.out.println("Violations: "+violations);
        System.out.println("DUI Violation: "+violationDUI);
        System.out.println("Red Light Violation: "+violationRedLight);
        System.out.println("Speeding Violation: "+violationSpeeding);
    }

    public double demeritRate(double demeritAdjustment) {
        if(violations || creditScore <= 700) {
            demeritAdjustment = 300.000;

        } else {
            demeritAdjustment = 0;
        }

        return demeritAdjustment;

    } // end getRate

    public double ageCategory(double ageAdjustment) {
        if(age<= 25 || age>= 65) {
            ageAdjustment = 300.00;
        } else {
            ageAdjustment = 0;
        }

        return ageAdjustment;
    }

    // Change String to int
    public int identifyRegion(int states) {
            // New variable for use inside the method
        String zip2;

            // substring creates string from a string
            // (0,2) 0= start at place 0, 2= collect 2 characters starting at place 0
            // Turn that into a new substring assigned to zip2
        zip2 = zipCode.substring(0, 2);

            // cityCode is our variable that will be assigned the resulting integer
            // Integer is the class
            // .parseInt parses a String containing numbers into an integer format (allows for - to indicate negative numbers)
        cityCode = Integer.parseInt(zip2);

        if(cityCode >=90 && cityCode <=96) {
            System.out.println("Your zipcode ("+zipCode+") tells us you reside in California");

        } else if (cityCode == 97) {
            System.out.println("Your zipcode ("+zipCode+") tells us you reside in Oregon");

        } else if(cityCode ==98 || cityCode==99) {
            System.out.println("Your zipcode ("+zipCode+") tells us you reside in Washington");

        } else {
            System.out.println("It appears you live outside of the Pacific Northwest. Please contact our National office.");

        }

        return states;

    } // end identifyRegion

// Surcharge for California region

    public double californiaRegion(double stateAdjustment) {
        if(cityCode>=90 && cityCode <=96){
            stateAdjustment = 200.00;

        } else {
            stateAdjustment = 0;

        }

        return stateAdjustment;

    } // end californiaRegion



} // end person

public class PersonRegular {
    public static void main(String[]args) {

        // ----- CREATE VARIABLES -----

        String FirstPersonName = "Calie";
        String SecondPersonName = "Otis";
        char FirstPersonGender = 'F';
        char SecondPersonGender = 'M';
        int FirstPersonAge = 33;
        int SecondPersonAge = 21;
        String FirstPersonCar = "Volkswagen Beetle";
        String SecondPersonCar = "Ford Mustang";
        boolean FirstPersonViolations = false;
        boolean SecondPersonViolations = true;
        int FirstPersonCreditScore = 690;
        int SecondPersonCreditScore = 640;

        double MonthlyRate1;
        double MonthlyRate2;
        double AdjustedRate1;
        double AdjustedRate2;
        double Total1;
        double Total2;


        // ----- LOGIC -----
        // Older, Female, No Violations, Higher Credit Score = Lower Rate
        // Younger, Male, Violations, Lower Credit Score = Higher Rate


        // VIOLATIONS & CREDIT SCORE
        if(FirstPersonViolations == true && FirstPersonCreditScore <= 700) {
            MonthlyRate1 = 500;
        } else {
            MonthlyRate1 = 100;
        }


        if(SecondPersonViolations == true && SecondPersonCreditScore <= 700) {
            MonthlyRate2 = 500;
        } else {
            MonthlyRate2 = 100;
        }


        // AGE & GENDER
        if(FirstPersonAge <=25 && FirstPersonGender == 'F') {
            AdjustedRate1 = 100;
        } else {
            AdjustedRate1 = 0;
        }


        if(SecondPersonAge <=25 && SecondPersonGender == 'M') {
            AdjustedRate2 = 100;
        } else {
            AdjustedRate2 = 0;
        }


        // ----- MATH -----
        Total1 = MonthlyRate1 + AdjustedRate1;
        Total2 = MonthlyRate2 + AdjustedRate2;


        System.out.println("First Person Name: "+FirstPersonName);
        System.out.println("First Person Gender: "+FirstPersonGender);
        System.out.println("First Person Age: "+FirstPersonAge);
        System.out.println("First Person Car: "+FirstPersonCar);
        System.out.println("First Person Violations: "+FirstPersonViolations);
        System.out.println("First Person Credit Score: "+FirstPersonCreditScore);
        System.out.println("      Preliminary Monthly Rate: "+MonthlyRate1);
        System.out.println("      Adjusted Monthly Rate: "+Total1);

        System.out.println();

        System.out.println("Second Person Name: "+SecondPersonName);
        System.out.println("Second Person Gender: "+SecondPersonGender);
        System.out.println("Second Person Age: "+SecondPersonAge);
        System.out.println("Second Person Car: "+SecondPersonCar);
        System.out.println("Second Person Violations: "+SecondPersonViolations);
        System.out.println("Second Person Credit Score: "+SecondPersonCreditScore);
        System.out.println("       Preliminary Monthly Rate: "+MonthlyRate2);
        System.out.println("       Adjusted Monthly Rate: "+Total2);


    }

}

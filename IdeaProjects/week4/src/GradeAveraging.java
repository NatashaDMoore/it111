import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] arg) {

        // ask end user to input grades
        int grade;
        double total = 0, average;
        int counter = 1;

        Scanner input = new Scanner(System.in);         // System.in because we are receiving input

        // While loops will count how many times we are asking the user to input a grade

        while (counter <= 5) {
            System.out.println("Please enter your numerical grade for assignment #" + counter);
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } // end of while loop

        String message;
        char letterGrade;

        counter -= 1;            // remove one counter to total 5 assignments. Counter starts at 1 (assignment 1 not 0)
        average = total / counter;

        // System.out.println("Your average grade is " + average + "% for " + counter + " assignments.");


        if (average >= 90) {
            letterGrade = 'A';
            message = "Excellent work!";

        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";

        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying needed.";

        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by.";

        } else {
            letterGrade = 'F';
            message = "Not a passing grade.";
    } // end for loop

        System.out.println("Your average grade is " + average + "% for " + counter + " assignments.");
        System.out.println("This earns you a letter grade of "+letterGrade+". "+message);


    } // end pub
}

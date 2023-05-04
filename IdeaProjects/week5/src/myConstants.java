import java.util.Scanner;

public class myConstants {
    public static void main(String[] arg) {

        final int TOUCHDOWN =6;
        final int PAT = 1;
        final int FIELDGOAL = 3;

        int td, pat, fg;

        // ask the user to enter the number of touchdowns PATs and field goals

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of touchdowns.");
            td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter number of PATs (point after touchdown).");
            pat = input.nextInt() * PAT;
        System.out.println("Please enter number of field goals.");
            fg = input.nextInt() * FIELDGOAL;

        System.out.println(td);
        System.out.println(pat);
        System.out.println(fg);




    }
}

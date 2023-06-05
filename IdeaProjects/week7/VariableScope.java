public class VariableScope {
    public static void main(String[]args) {

        // We are inside the main method

        String txt = "This is the local variable in the main method";

        System.out.println(txt);

        // In order for our sub method to run we must call the method in the main method
        sub();
    }

    public static void sub() {

        String txt = "This is the local variable in the sub method";

        System.out.println(txt);

    }



}

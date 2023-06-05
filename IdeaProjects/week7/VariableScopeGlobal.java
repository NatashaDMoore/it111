public class VariableScopeGlobal {

  final static String txt = "This is a GLOBAL variable of the VariableScopeGlobal class";
    public static void main(String[]args) {

        String txt = "This is my local variable in the main method";

        // Calls the variable from the main method
        System.out.println(txt);

        // Print the global variable
        // Class.variable
        System.out.println(VariableScopeGlobal.txt);

        // Calls the sub method
        sub();
    }

    public static void sub() {

        String txt = "This is my local variable in the sub method";

        System.out.println(txt);

    }
}

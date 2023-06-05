import java.io.File;

public class MyFile {

    public static void main(String[]arg) {

        File dir = new File("NewFolder");
        // Create an if else statement
        // If directory exists, Great. Else, do something.

        if(dir.exists()) {
            System.out.println("Score!");
        } else {
            System.out.println("Whoops!");
        }


    }
}

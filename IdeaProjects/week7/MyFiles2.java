import java.io.File;

import static java.lang.System.out;
public class MyFiles2 {
    public static void main(String[]args) {

        File dir = new File("NewFolder");
        // Start with an if else statement

        if(dir.exists()) {
            // Call out the array

            // If the directory exists, take the directory list and assign it to the String[] array
            String[] files= dir.list();

            // new keyword named assert
            assert files != null;

            // X amount of files have been found. Concatenated
            out.println(files.length + " files found");

            // We would like to see the files
            // Use a for loop

            // Count using i
            // i starts at 0
            // i must be less than total number of files (this stops the loop when i=number of files)
            // Loop increases i by one each time
            for(int i = 0; i< files.length; i++) {

                // print array files[reference i]
                out.println(files[i]);
            }

        } else {
            out.println("Directory does not exist");
        }

    } //main
}//pub

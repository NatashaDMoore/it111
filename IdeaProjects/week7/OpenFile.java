import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[]args) {

        File file;
        Scanner inputFile;
        String fileName;

        fileName = JOptionPane.showInputDialog("Enter " + "name of the file");
        // attempt to open the file

        try{

            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found. Displayed in CATCH");

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null, "The file was not found.");

        }

        JOptionPane.showMessageDialog(null, "Program has finished running.");


    }
}

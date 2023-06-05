import javax.swing. *;

public class ShowWindow {

    public static void main(String[] args) {
        //declare our variables
        // Make variables constants

        final int WINDOW_WIDTH = 350; // means pixels
        final int WINDOW_HEIGHT = 250;

        //create window

        JFrame window = new JFrame();
        // scanner input = new Scanner(System.in)
        // New variable is a new object

        // object title
        window.setTitle("My Simple Window");

        // set the size of window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        // close window will exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display the window - required
        //displaying the window is a boolean

        window.setVisible(true);





    }
}

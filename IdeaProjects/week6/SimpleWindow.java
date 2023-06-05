import javax.swing.*;

public class SimpleWindow extends JFrame {

    // by extending the class we do not need a main method
    // Instead have a CONSTRUCTOR - a special method that displays our attributes

    public SimpleWindow() {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("Second Window");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);


    }
}

import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTextField;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // Always be aware of the colors that IntelliJ is using

    // Create a constructor which is a special method to initialize our message

    public KiloConverter() {

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);


    }

    public void buildPanel() {
        // add method to create buildPanel for use above
        messageLabel = new JLabel("Enter a distance in Kilometers");

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");

        panel = new JPanel();

        // We now must add the 3 above components onto the JPanel

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);

    }

    // We must add the main method
    public static void main(String[]args) {

        new KiloConverter();

    }


}

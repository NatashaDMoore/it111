import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {
        public static void main(String[] args) {

            final int WINDOW_WIDTH = 350;
            final int WINDOW_HEIGHT = 550;


            //create components

            JFrame window = new JFrame();
                window.getContentPane().setBackground(Color.RED);
                window.setLocation(500,400);
                window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
                window.setTitle("My Simple Window");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



            JLabel myLabel = new JLabel();
                myLabel.setText("My First Label");
                myLabel.setFont(new Font("Verdana",Font.PLAIN, 20));
                myLabel.setBounds(5, 1, 300, 30);


            JTextField myText = new JTextField();
                myText.setBounds(5, 50, 300, 30);


            JLabel myLabel2= new JLabel("My Second Label");
                myLabel2.setFont(new Font("Verdana", Font.BOLD, 10));
                myLabel2.setText("My Second Label");
                myLabel2.setBounds(5, 90, 300, 30);


            JTextField myText2 = new JTextField(5);
                myText2.setBounds(5,130,300,30);



            // add components


            window.add(myLabel);
            window.add(myText);
            window.add(myLabel2);
            window.add(myText2);

            window.setVisible(true);


        }
}







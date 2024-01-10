package GUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// Creating a frame in a class outside the main method
public class GUI03 extends JFrame {

    // Constructor
    GUI03() {
        this.setTitle("Playing around with JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);
        
        // Change ICON
        ImageIcon image = new ImageIcon("resources/startup.png");
        this.setIconImage(image.getImage());

        // Change background color
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }

    public static void main(String[] args) {
        GUI03 frame = new GUI03(); // can also use "new GUI3()" if you don't plan to make any changes


    }
}

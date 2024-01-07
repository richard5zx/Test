import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Playing around with JFrame"); // Set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application. By default it is hide on close not exit which means its still runnning
        frame.setResizable(false); // Prevents resizing of window and prevents fullscreen too
        frame.setSize(420, 420); // sets x and y dimension of frame
        frame.setVisible(true); // make frame visible
        
        // Change Icon of frame (Image from www.flaticon.com)
        ImageIcon image = new ImageIcon("resources/startup.png");
        frame.setIconImage(image.getImage());

        // Change background color of frame
        frame.getContentPane().setBackground(Color.RED);
        // frame.getContentPane().setBackground(new Color(255,255, 255)); // Custom color
        
    }
}

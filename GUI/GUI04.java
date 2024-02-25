package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI04 {
    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        // Create frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(525, 525);
        frame.setVisible(true);
        
        // Create label
        JLabel label = new JLabel();
        label.setText("Pink Face");

        // Create image
        ImageIcon image = new ImageIcon("GUI/resources/SquareFace.png");
        label.setIcon(image);
        
        // Add label
        frame.add(label);

        // Set position of label relative to imageicon
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, Bottom of imageicon

        // Change color and font of label
        label.setForeground(Color.PINK);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        // Set gap distance between image and label
        label.setIconTextGap(-5);
        
        // Set background
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        // Create Border
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);

        // Move image relative to the border
        // Set position of icon+ text within label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Set bounds
        //label.setBounds(0, 0 , 250, 250); // set x , y position within frame as well as dimensions
        //frame.setLayout(null);

        // Resize frame to accomodate all components you have
        // so you dont need to set bounds or set size.
        // Very useful function
        // if you wanna youse pack make sure to add all components before using pack
        frame.pack();

    }
}

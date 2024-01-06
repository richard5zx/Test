import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public static void main(String[] args) {
        // Test
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        // Layout part
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        // Password part
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);
        
        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);
        
        // Submit button part
        JButton button = new JButton(" Login");
        button.setBounds(80, 90, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);
        
        JLabel sucess = new JLabel("");
        sucess.setBounds(10, 110, 300, 25);
        panel.add(sucess);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }
}
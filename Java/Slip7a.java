// A) Write a java program to display Label with text Dr. D Y Patil College,
// background color Red and font size 20 on the frame. 
import javax.swing.*;
import java.awt.*;

public class Slip7a {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Label Example");

        // Create a JLabel with the specified text
        JLabel label = new JLabel("Dr. D Y Patil College");

        // Set the font size to 20
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Set the background color to red
        label.setBackground(Color.RED);
        label.setOpaque(true); // Make the label opaque to show the background color

        // Set the layout of the frame
        frame.setLayout(new FlowLayout());

        // Add the label to the frame
        frame.add(label);

        // Set frame properties
        frame.setSize(400, 100); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the frame is closed
        frame.setVisible(true); // Make the frame visible

        // Make sure the label is visible (by default, labels are not visible)
        label.setVisible(true);
    }
}


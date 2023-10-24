import java.awt.*;
import java.awt.event.*;

public class Slip20a {
    public static void main(String[] args) {
        // Create a new frame with the title "TYBBACA"
        Frame frame = new Frame("TYBBACA");

        // Set the background color to red
        frame.setBackground(Color.RED);

        // Add a window listener to handle the close button click
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the frame and exit the program
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

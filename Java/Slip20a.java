/*
 Write a java program using AWT to create a Frame with title “TYBBACA”, 
background color RED. If user clicks on close button then frame should close
 */

import java.awt.*;
import java.awt.event.*;

public class Slip20a {
    public static void main(String[] args) {
        
        Frame frame = new Frame("TYBBACA");

  
        frame.setBackground(Color.RED);

       
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

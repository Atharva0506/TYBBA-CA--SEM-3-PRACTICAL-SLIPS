import javax.swing.*;
import java.awt.*;

public class Slip26b {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Temple Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel templePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

            g.drawRect(100,150,90,120);
            g.drawRect(130,230,20,40);
            g.drawLine(150,100,100,150);
            g.drawLine(150,100,190,150);
            g.drawLine(150,50,150,100);
            g.drawRect(150,50,20,20);
            }
        };

        frame.getContentPane().add(templePanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    };

}


import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SmileyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the head (a yellow circle)
        g2d.setColor(Color.YELLOW);
        g2d.fill(new Ellipse2D.Double(50, 50, 200, 200));

        // Draw the left eye (black circle)
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(100, 100, 40, 40));

        // Draw the right eye (black circle)
        g2d.fill(new Ellipse2D.Double(160, 100, 40, 40));

        // Draw the mouth (smile)
        g2d.draw(new Arc2D.Double(100, 150, 100, 60, 0, -180, Arc2D.OPEN));
    }
}

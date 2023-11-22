import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Slip29b extends JFrame {

    private BallPanel ballPanel;

    public Slip29b() {
        setTitle("Bouncing Ball");
       
        initializeUI();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    private void initializeUI() {
        ballPanel = new BallPanel();
        add(ballPanel);


        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPanel.moveBall();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Slip29b();
    }

    private static class BallPanel extends JPanel {

        private int x = 50;
        private int y = 50;
        private int xSpeed = 2;
        private int ySpeed = 2;
        private Color ballColor;

        public BallPanel() {
            ballColor = getRandomColor();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(ballColor);
            g.fillOval(x, y, 50, 50);
        }

        public void moveBall() {
            if (x + xSpeed < 0 || x + xSpeed > getWidth() - 50) {
                xSpeed = -xSpeed;
                changeColor();
            }
            if (y + ySpeed < 0 || y + ySpeed > getHeight() - 50) {
                ySpeed = -ySpeed;
                changeColor();
            }
            x += xSpeed;
            y += ySpeed;
            repaint();
        }

        public void changeColor() {
            ballColor = getRandomColor();
            repaint();
        }

        private Color getRandomColor() {
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            return new Color(red, green, blue);
        }
    }
}

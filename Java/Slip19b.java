import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Slip19b extends JFrame {
    private JLabel positionLabel,keyLabel;

    public Slip19b() {
        positionLabel = new JLabel("Cursor Position: (0, 0)");
        keyLabel = new JLabel("Key Event: ");

        setLayout(new GridLayout(2,1));
        add(positionLabel);
        add(keyLabel);

        addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e) {
                updatePositionLabel(e.getX(), e.getY());
            }

            public void mouseDragged(MouseEvent e) {
                updatePositionLabel(e.getX(), e.getY());
            }
        });

        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
               
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
                else{
                updateKeyLabel(e.getKeyChar());
                }
            }

            public void keyReleased(KeyEvent e) {
               
            }
        });

        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Cursor Position Tracker");
        setVisible(true);
    }

    private void updatePositionLabel(int x, int y) {
        positionLabel.setText("Cursor Position: (" + x + ", " + y + ")");
    }
    private void updateKeyLabel(char keyChar) {
        keyLabel.setText("Key Event: " + keyChar);
    }

    public static void main(String[] args) {
                new Slip19b();       
    }
}

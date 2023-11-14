import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip2b {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Mouse Events Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField textField = new JTextField("Mouse Event Information");
            textField.setEditable(false);
            frame.add(textField, BorderLayout.SOUTH);

            JPanel panel = new JPanel();
            frame.add(panel, BorderLayout.CENTER);

            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
                }
            });

            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}

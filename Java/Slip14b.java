import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EmployeeDetailsFrame extends JFrame {
    JLabel labelEno, labelEName, labelSal;
    JTextField textFieldEno, textFieldEName, textFieldSal;
    JButton submitButton;

    public EmployeeDetailsFrame() {
        labelEno = new JLabel("Employee Number:");
        labelEName = new JLabel("Employee Name:");
        labelSal = new JLabel("Salary:");

        textFieldEno = new JTextField();
        textFieldEName = new JTextField();
        textFieldSal = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eno = textFieldEno.getText();
                String eName = textFieldEName.getText();
                String sal = textFieldSal.getText();

                dispose(); 

                new DisplayFrame(eno, eName, sal);
            }
        });

        setLayout(new GridLayout(4, 2));
        add(labelEno);
        add(textFieldEno);
        add(labelEName);
        add(textFieldEName);
        add(labelSal);
        add(textFieldSal);
        add(new JLabel()); 
        add(submitButton);

        setTitle("Employee Details Entry");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}

class DisplayFrame extends JFrame {
    public DisplayFrame(String eno, String eName, String sal) {
        JLabel labelEno = new JLabel("Employee Number: " + eno);
        JLabel labelEName = new JLabel("Employee Name: " + eName);
        JLabel labelSal = new JLabel("Salary: " + sal);

        setLayout(new GridLayout(3, 1));
        add(labelEno);
        add(labelEName);
        add(labelSal);

        setTitle("Employee Details Display");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

public class Slip14b {
    public static void main(String[] args) {
       new EmployeeDetailsFrame();
    }
}

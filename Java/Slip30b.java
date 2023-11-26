import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slip30b extends JFrame {

    private JTextField firstNameField, lastNameField, addressField, mobileNumberField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox computerCheckBox, sportsCheckBox, musicCheckBox;

    public Slip30b() {
        setTitle("Personal Information");
        initializeUI();
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

    }

    private void initializeUI() {
    JPanel mainPanel = new JPanel(new GridLayout(9, 2, 3, 5));

    JPanel headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JLabel headingLabel = new JLabel("Personal Information");
    
    headingPanel.add(headingLabel);

    mainPanel.add(headingPanel);
    mainPanel.add(new JLabel());

        mainPanel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        mainPanel.add(firstNameField);

        mainPanel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        mainPanel.add(lastNameField);

        mainPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        mainPanel.add(addressField);

        mainPanel.add(new JLabel("Mobile Number:"));
        mobileNumberField = new JTextField();
        mainPanel.add(mobileNumberField);

        mainPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        mainPanel.add(genderPanel);

        mainPanel.add(new JLabel("Your Interests:"));
        JPanel interestsPanel = new JPanel();
        computerCheckBox = new JCheckBox("Computer");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        interestsPanel.add(computerCheckBox);
        interestsPanel.add(sportsCheckBox);
        interestsPanel.add(musicCheckBox);
        mainPanel.add(interestsPanel);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitAction();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAction();
            }
        });

        mainPanel.add(submitButton);
        mainPanel.add(resetButton);

        getContentPane().add(mainPanel);
    }

    private void submitAction() {
        
        System.out.println("First Name: " + firstNameField.getText());
        System.out.println("Last Name: " + lastNameField.getText());
        System.out.println("Address: " + addressField.getText());
        System.out.println("Mobile Number: " + mobileNumberField.getText());

        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        System.out.println("Gender: " + gender);

        System.out.println("Interests:");
        if (computerCheckBox.isSelected()) {
            System.out.println("- Computer");
        }
        if (sportsCheckBox.isSelected()) {
            System.out.println("- Sports");
        }
        if (musicCheckBox.isSelected()) {
            System.out.println("- Music");
        }
    }

    private void resetAction() {
        firstNameField.setText("");
        lastNameField.setText("");
        addressField.setText("");
        mobileNumberField.setText("");
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        computerCheckBox.setSelected(false);
        sportsCheckBox.setSelected(false);
        musicCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        new Slip30b();
    }
}

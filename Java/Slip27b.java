import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Slip27b extends JFrame {

    private JTextField directoryTextField;
    private JTextArea fileListTextArea;

    public Slip27b() {
        setTitle("File Explorer");
        

        initializeUI();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void initializeUI() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Enter Directory Path:");
        directoryTextField = new JTextField();
        JButton listFilesButton = new JButton("List Files");

        fileListTextArea = new JTextArea();

        mainPanel.add(label, BorderLayout.NORTH);
        mainPanel.add(directoryTextField, BorderLayout.CENTER);
        mainPanel.add(listFilesButton, BorderLayout.SOUTH);

        listFilesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listFilesAndDirectories();
            }
        });

        getContentPane().add(mainPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(fileListTextArea), BorderLayout.CENTER);
    }

    private void listFilesAndDirectories() {
        String directoryPath = directoryTextField.getText();

        if (directoryPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a directory path.");
            return;
        }

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            JOptionPane.showMessageDialog(this, "Invalid directory path.");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            fileListTextArea.setText("");

            for (File file : files) {
                fileListTextArea.append(file.getName() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new Slip27b();
    }
}

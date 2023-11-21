import java.awt.*;
import java.awt.event.*;

class MultiplicationTable extends Frame implements ActionListener {
    private Label label;
    private TextField textField;
    private Button button;
    private List list;

    public MultiplicationTable() {
        setLayout(new FlowLayout());

        label = new Label("Enter a number: ");
        add(label);

        textField = new TextField(10);
        add(textField);

        button = new Button("Show Table");
        add(button);

        list = new List();
        add(list);

        button.addActionListener(this);

        setTitle("Multiplication Table");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(textField.getText());
        String[] table = new String[10];

        for (int i = 0; i < 10; i++) {
            table[i] = num + " x " + (i + 1) + " = " + num * (i + 1);
        }

        list.removeAll();
        for (String s : table) {
            list.add(s);
        }
    }

}

public class Slip12b {
     public static void main(String[] args) {
        new MultiplicationTable();
    }
}   

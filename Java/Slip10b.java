import java.awt.*;
import java.awt.event.*;

class CompundIntrest extends WindowAdapter implements ActionListener  {
    Frame f;
    Label heading,pAmt,rate,year,total,intrestAmt;
    TextField tPamt,tIrate,tyear,tTotal,tIntresrAmt;
    Button cal,clear,close;
    double a,r,y,t,ia;
    CompundIntrest() {
        f = new Frame("Compund Intrest");
        tPamt = new TextField();
        tIrate = new TextField();
        tyear = new TextField();
        tTotal = new TextField();
        tTotal.setEnabled(false);
        tIntresrAmt = new TextField();
        tIntresrAmt.setEnabled(false);
        heading = new Label("Compund Intrest Calculator");
        pAmt = new Label("Principal Amount: ");
        rate = new Label("Intrest Rate(%): ");
        year = new Label("Time(Yrs): ");

        total = new Label("Total Amount: ");
        intrestAmt = new Label("Total Intrest: ");

        cal = new Button("Calculate");
        clear = new Button("Clear");
        close = new Button("Close");

        cal.addActionListener(this);
        clear.addActionListener(this);
        close.addActionListener(this);


        heading.setFont(new Font("Arial", Font.BOLD, 14));
        heading.setAlignment(Label.CENTER);

        heading.setBounds(50,50,300,30);
        pAmt.setBounds(30,100,100,20);
        rate.setBounds(30,130,100,20);
        year.setBounds(210,130,80,20);
        total.setBounds(30,160,100,20);
        intrestAmt.setBounds(30,190,100,20);
        
        tPamt.setBounds(150,100,100,20);
        tIrate.setBounds(150,130,50,20);
        tyear.setBounds(300,130,50,20);
        tTotal.setBounds(150,160,100,20);
        tIntresrAmt.setBounds(150,190,100,20);

        cal.setBounds(50,250,80,30);
        clear.setBounds(150,250,80,30);
        close.setBounds(250,250,80,30);




        f.add(heading);
        f.add(pAmt);
        f.add(rate);
        f.add(year);
        f.add(total);
        f.add(intrestAmt);

        f.add(tPamt);
        f.add(tIrate);
        f.add(tyear);
        f.add(tTotal);
        f.add(tIntresrAmt);

        f.add(cal);
        f.add(clear);
        f.add(close);

        
        f.addWindowListener(this);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
        System.exit(0);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cal) {
            a = Double.parseDouble(tPamt.getText());
            r = Double.parseDouble(tIrate.getText());
            y = Double.parseDouble(tyear.getText());


            ia = a * Math.pow(1 + r / 100, y) - a;
            t = a+ia;
            tTotal.setText(String.valueOf(t));
            tIntresrAmt.setText(String.valueOf(ia));
        }
        if (e.getSource() == clear) {
            tPamt.setText("");
            tIrate.setText("");
            tyear.setText("");
            tTotal.setText("");
            tIntresrAmt.setText("");
        }
        if (e.getSource() == close) {
            f.dispose();
            System.exit(0);
        }
    }
   

}
public class Slip10b {
     public static void main(String[] args) {
        new CompundIntrest();
    }
}

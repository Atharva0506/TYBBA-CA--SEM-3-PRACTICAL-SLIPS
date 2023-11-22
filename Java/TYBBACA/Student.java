package TYBBACA;

public class Student {
    int Rno;
    String SName;
    double Per;

   
    public Student(int rno, String sName, double per) {
        Rno = rno;
        SName = sName;
        Per = per;
    }

    public void disp() {
        System.out.println("Roll Number: " + Rno);
        System.out.println("Student Name: " + SName);
        System.out.println("Percentage: " + Per);
        System.out.println("---------------------");
    }
}

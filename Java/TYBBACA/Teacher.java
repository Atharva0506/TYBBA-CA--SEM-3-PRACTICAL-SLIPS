package TYBBACA;

public class Teacher {
    int TID;
    String TName;
    public String Subject;

    // Constructor
    public Teacher(int tid, String tName, String subject) {
        TID = tid;
        TName = tName;
        Subject = subject;
    }

    // Display method
    public void disp() {
        System.out.println("Teacher ID: " + TID);
        System.out.println("Teacher Name: " + TName);
        System.out.println("Subject: " + Subject);
        System.out.println("---------------------");
    }
}

/*
 // TYBBACA/Student.java
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
// TYBBACA/Teacher.java
package TYBBACA;

public class Teacher {
    int TID;
    String TName;
    String Subject;


    public Teacher(int tid, String tName, String subject) {
        TID = tid;
        TName = tName;
        Subject = subject;
    }

    
    public void disp() {
        System.out.println("Teacher ID: " + TID);
        System.out.println("Teacher Name: " + TName);
        System.out.println("Subject: " + Subject);
        System.out.println("---------------------");
    }
}

 */


import TYBBACA.Student;
import TYBBACA.Teacher;

public class Slip24b {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(101, "S1", 85.5);
        students[1] = new Student(102, "S2", 78.9);
        students[2] = new Student(103, "S3", 92.3);

 
        System.out.println("Details of Students:");
        for (Student student : students) {
            student.disp();
        }


        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher(501, "T1", "Java");
        teachers[1] = new Teacher(502, "T2", "Cyber Security");

        System.out.println("Details of Teachers (Teaching Java):");
        for (Teacher teacher : teachers) {
            if (teacher.Subject.equals("Java")) {
                teacher.disp();
            }
        }
    }
}

import java.util.Scanner;
class InvaildData extends Exception{
    public InvaildData(String s){
        super(s);
    }
}

public class Slip9b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter the PAN Number");
        String pan = sc.next();
        vailidatePan(pan);
        System.out.println("Enter Mobaile Number ");
        String mobaileNo = sc.next();
        vailidateMobaileNo(mobaileNo);
        System.out.println("Data is vaild");
        System.out.println("Pan no: " + pan);
        System.out.println("Mobail no: " + mobaileNo);
        } catch (InvaildData e) {
           System.err.println(e.getMessage());
        }
        
        
        sc.close();
    }
    public static void vailidatePan(String s) throws InvaildData {
        if ((!s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) ) {
            throw new InvaildData("Invalid");
        }
    }
    public static void vailidateMobaileNo(String s) throws InvaildData {
        if ((!s.matches("[0-9]{10}")) ) {
            throw new InvaildData("Invalid Data");
        }
    }
}

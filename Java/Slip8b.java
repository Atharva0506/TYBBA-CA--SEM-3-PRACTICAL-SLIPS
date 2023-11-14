import java.io.File;

public class Slip8b {
    public void printFileNames(File[] a, int i) {
        if (i == a.length) {
            return;
        }
        if (a[i].isFile()) {
            System.out.println("i: "+i);
            if (a[i].getName().endsWith(".txt")) {
                System.out.println(a[i].getName());  
            }
        }

        printFileNames(a, i + 1);
    }

    public static void main(String[] args) {
  
        String path = "E:\\BBA CA\\SEM-5 Peactical slips\\Java";

        File fObj = new File(path);
      
        Slip8b obj = new Slip8b();
        if (fObj.exists() && fObj.isDirectory()) {
            File a[] = fObj.listFiles();
            System.out.println("Displaying Files from the directory : " + fObj);  
            obj.printFileNames(a, 0);
        }
    }
}
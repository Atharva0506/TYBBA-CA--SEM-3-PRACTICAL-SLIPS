import java.io.*;

public class Slip5b {
	public static void main(String[] args) {

		try {
			for (int i = 0; i < args.length; i++) {
				File file = new File(args[i]);
				if (args[i].endsWith(".txt")) {
					if (file.delete()) {
						System.out.println("File Type IS txt Deleted!: " + args[i]);
					}
				} else {
					System.out.println("File Name is: " + file.getName());
					System.out.println("File Loaction: " + file.getAbsolutePath());
					System.out.println("File Size in bytes: " + file.length());
				}
				System.err.println("");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

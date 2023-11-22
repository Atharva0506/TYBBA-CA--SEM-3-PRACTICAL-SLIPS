import java.util.Hashtable;
import java.util.Scanner;


public class Slip21b {

    public static void main(String[] args) {
          
            Hashtable<String, String> cityStdCodes = new Hashtable<>();
    
            cityStdCodes.put("City1", "STD1");
            cityStdCodes.put("City2", "STD2");
            cityStdCodes.put("City3", "STD3");
          
    
          
            System.out.println("Hashtable Details:");
            System.out.println("------------------");
            for (String city : cityStdCodes.keySet()) {
                System.out.println("City: " + city + ", STD Code: " + cityStdCodes.get(city));
            }
    
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the city to search for: ");
            String searchCity = scanner.nextLine();
    
            if (cityStdCodes.containsKey(searchCity)) {
                System.out.println("STD Code for " + searchCity + ": " + cityStdCodes.get(searchCity));
            } else {
                System.out.println("City not found in the hashtable.");
            }
            scanner.close();
        }
}

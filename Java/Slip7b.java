import java.util.*;

class Player {
    int pid;
    String pName;
    int totalRuns;
    int inningsPlayed;
    int noTimeOut;
    double avg;
    Player(int pid, String pName, int totalRuns, int inningsPlayed, int noTimeOut) {
        this.pid = pid;
        this.pName = pName;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.noTimeOut = noTimeOut;
        this.avg = totalRuns/noTimeOut; 
    }

    
}

public class Slip7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many player you want to inseret");
        int n = sc.nextInt();
        Player[] players = new Player[n];
   
        for (int i = 0; i < n; i++) {
            System.err.println("Enter Data for " + (i+1) +"player");
            System.out.println("Enter player ID: ");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Player Name: ");
            String name = sc.next();
            System.out.println("Enter Total Runs");
            int totalRuns = sc.nextInt();
            System.out.println("Enter No  innings played: ");
            int noOfInnings = sc.nextInt();
            System.out.println("Enter number time out: ");
            int noTimeOut = sc.nextInt();
            players[i] = new Player(pid, name, totalRuns, noOfInnings, noTimeOut);    
        }
        double maxAvg =0;
        String pName ="";
        for(int i = 0; i < players.length; i++){
            if (players[i].avg>maxAvg) {
                System.out.println("Calculting Average: " + players[i].pName);
                maxAvg = players[i].avg;
                pName = players[i].pName;
            }
        }
        System.out.println("Max Average of player: " + pName + " has average: "+maxAvg);;
        
        

        sc.close();
    }
   
}

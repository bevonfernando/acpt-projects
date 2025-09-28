import java.util.Scanner;
public class CricketScore {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the Run Scores of all 11 players ");

        int[] scores = new int[11];



        for (int i=0; i<11; i++){
            System.out.print("Enter the Run score of the player " + (i+1) + " : ");
            scores[i] = Scan.nextInt();

        }

        int highestScore = scores[0];

        for (int j=0; j<11; j++){
            if (highestScore<scores[j]){
                highestScore=scores[j];
            }

        }

        System.out.println("Highest Score is : " +highestScore);

        double averageRuns=0.0;

        for (int z = 0; z<11; z++){
            averageRuns+=scores[z];
        }

        System.out.println("Average score is : " + (averageRuns/11));


    }
}

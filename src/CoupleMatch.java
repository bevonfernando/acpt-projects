import java.util.Scanner;
public class CoupleMatch {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter the Boys age : ");
        int boyAge = Scan.nextInt();

        System.out.print("Enter the Girls age : ");
        int girlAge = Scan.nextInt();

        if (boyAge>girlAge){
            System.out.print("Enter Boys Name : ");
            String boyName = Scan.next();

            System.out.print("Enter Girls Name : ");
            String girlName = Scan.next();

            char boyFirstLetter = boyName.charAt(0);
            char girlFirstLetter = girlName.charAt(0);
            System.out.println("First letter of the boy : " +boyFirstLetter);
            System.out.println("First letter of the girl : " +girlFirstLetter);
            int bFL = boyFirstLetter;
            int gFL = girlFirstLetter;

            if (gFL>bFL){
                System.out.println("Definitely marry");

            }
            else {
                System.out.println("Not A Good Match");
            }

        }

        else if (boyAge >= girlAge) {
            System.out.println("Think Twice");

        }

        else  {
            System.out.println("Dont Marry");
        }


    }
}

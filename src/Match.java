import java.util.Scanner;
public class Match {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String userName = Scan.next();
        System.out.print("Enter Your Age : ");
        int age = Scan.nextInt();


        for (int i = 0; i<10; i++){
            System.out.print("Enter the name of the girl " + (i+1) + " : ");
            String girlName = Scan.next();

            System.out.print("Enter the Age of the girl " + (i+1) + " : ");
            int girlAge = Scan.nextInt();

            int myFirstLetter = userName.charAt(0);
            int girlFirstLetter = girlName.charAt(0);


            if (myFirstLetter<=girlFirstLetter && age>girlAge ){
                System.out.println(girlName + " Matched");

                break;
            }
            else {
                System.out.println(girlName + " Not match");
            }

        }
    }
}

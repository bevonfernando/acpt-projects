import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int numberOne = Scan.nextInt();

        System.out.print("Enter Number 2 : ");
        int numberTwo = Scan.nextInt();


        if (numberOne>numberTwo){
            System.out.println("Number 1 is the Highest Number : " +numberOne);
        }
        else if (numberOne==numberTwo) {
            System.out.println("Both the numbers are Same : " +numberOne);

        }
        else {
            System.out.println("Number 2 is the Highest Number : " +numberTwo);
        }
    }
}

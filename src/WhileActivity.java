import java.util.Scanner;
public class WhileActivity {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = Scan.next();
        System.out.print("Enter Your Age : ");
        int age = Scan.nextInt();

        while(age>=100){
            System.out.println("The age entered is not possible. Enter the correct age ");
            age= Scan.nextInt();
        }

        System.out.print("Enter Your Address : ");
        String address = Scan.next();
        System.out.print("Enter Your Telephone Number : ");
        int tele = Scan.nextInt();
    }
}

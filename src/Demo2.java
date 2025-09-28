import java.util.Scanner;
public class Demo2 {

    public static void main(String[] args) {

        //Scanner Setup

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int val1 = Scan.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = Scan.nextInt();

        int answer = val1+val2;

        System.out.println(answer);

        // sting ---> scan.next()
        // doublt ---> scan.double()

    }
}

import java.util.Scanner;
public class Whilenumber {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int number = Scan.nextInt();

        while(number > 0){
            System.out.println(number % 10+ ",");
            number = number /10;




        }


    }
}

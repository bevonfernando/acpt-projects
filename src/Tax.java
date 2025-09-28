/// //
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter August month income for employee 1 : ");
        double emp1 = Scan.nextDouble();

        System.out.print("Enter August month income for employee 2 : ");
        double emp2 = Scan.nextDouble();

        System.out.print("Enter August month income for employee 3 : ");
        double emp3 = Scan.nextDouble();

        System.out.print("Enter August month income for employee 4 : ");
        double emp4 = Scan.nextDouble();

        System.out.println("Average monthly income : " + ((emp1+emp2+emp3+emp4)/4));


        System.out.println("Total 13% of Tax value for the Government : " + ((emp1+emp2+emp3+emp4)*13/100));



    }
}

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        // There are 4 employees in Orange (pvt) ltd
        //get their salaries as user inputs
        // then find the average salary of an employee

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter the salary of the Employee 1 : ");
        double emp1 = Scan.nextDouble();

        System.out.print("Enter the salary of the Employee 2 : ");
        double emp2 = Scan.nextDouble();

        System.out.print("Enter the salary of the employee 3 : ");
        double emp3 = Scan.nextDouble();

        System.out.print("Enter the salary of the employee 4 : ");
        double emp4 = Scan.nextDouble();


        System.out.print("Average Salary : " + ((emp1 + emp2 + emp3 + emp4) / 4));


        //System.out.println(num1+num2); arithmetic operator
        //System.out.println("answer is  " + num1); string concat
        //System.out.println("answer is  " + num1 + num2); still string concat
        //System.out.println("answer is  " + (num1 + num2)); string concat + arithmetic operator




    }
}

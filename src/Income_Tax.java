import java.util.Scanner;
public class Income_Tax {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Your Salary : ");
        double salary = Scan.nextDouble();

        System.out.print("Kudu Income : ");
        double kudu = Scan.nextDouble();

        System.out.print("Land Income : ");
        double land = Scan.nextDouble();


        double totalIncome = salary+kudu+land;


        if(salary>=115000){

           salary = salary - (salary/100*14);
            System.out.println("Salary after income tax : " +salary );

        }

        else{
            System.out.println("No Income tax");
        }

        if(kudu>0){

           kudu = kudu/2;

            System.out.println("Income after income tax : " +kudu );

        }

        System.out.println("Total income is : " + (salary+kudu+land));





    }
}

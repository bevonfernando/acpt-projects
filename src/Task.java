import java.util.Scanner;
public class Task {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        double taxAmount = 0.0;

        for(int i=0; i<12; i++){
           System.out.print("Enter the salary of the employee " + (i+1) + " : ");
           double salary = Scan.nextDouble();

           if (salary>130000){
               taxAmount += (salary*14/100);


           }

       }
        System.out.println("Total Tax amount is : " + taxAmount);


    }
}

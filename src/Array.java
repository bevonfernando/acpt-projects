import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[] ages = new int[10];

        ages[3] = 54;

        System.out.println();

        for (int i = 0; i <10; i++){
            System.out.print("Enter Age for Studemt "+ (i+1));
            ages[i] = Scan.nextInt();
        }

        for (int i=0; i<10; i++){
            System.out.println(ages[i]);
        }


    }
}

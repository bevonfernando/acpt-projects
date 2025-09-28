import java.util.Scanner;
public class Lucky_Number {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the boys name : ");
        String boy = Scan.next();

        System.out.print("Enter the girls name : ");
        String girl = Scan.next();

        char firstLetter = boy.charAt(0);
        char lastLetter = girl.charAt(girl.length()-1);
        System.out.println("first letter is " + firstLetter  + " last letter "+lastLetter);
        int fl = firstLetter;
        int ll = lastLetter;

        System.out.println((fl+ll)/2);
    }
}

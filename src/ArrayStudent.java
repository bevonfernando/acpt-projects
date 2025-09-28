import java.util.Scanner;
public class ArrayStudent {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String[] subjects = new String[9];
        int[] termMarks = new int[9];

        for (int i = 0; i < 9; i++){
            System.out.print("Enter the Subject name : ");
            subjects[i] = Scan.next();
            System.out.print("Enter the Term marks : ");
            termMarks[i] = Scan.nextInt();
        }
        int highestMarks = termMarks[0];
        int subjectIndex = 0;

        for (int j = 0; j < 9 ; j++){
            if (termMarks[j]>highestMarks){
                highestMarks=termMarks[j];
                subjectIndex=j;
            }

        }

        System.out.println("highest marks : " +highestMarks);
        System.out.println("highest marks Subject : " +subjects[subjectIndex]);

        int average = 0;

        for (int q = 0; q < 9; q++){

            average+=termMarks[q];
        }

        System.out.println("Average marks " + (average/9));

    }
}

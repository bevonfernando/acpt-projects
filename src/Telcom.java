import org.w3c.dom.ls.LSOutput;

import  java.util.Scanner;
public class Telcom {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String email = "user@gmail.com";
        int password = 123456;

        System.out.println("Enter your Email Address : ");
        String logEmail = Scan.next();

        boolean isLoginSuccess = false;

        int dialog = 0;
        int airtel = 0;
        int mobitel = 0;
        System.out.println("Heyyyy telcom");

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the password");
            int logPassword = Scan.nextInt();
            if (logPassword == password && logEmail.equals(email)) {
                isLoginSuccess = true;
                break;
            }

            if (i == 4) {
                System.out.println("Account blocked");
            }
        }
            if (isLoginSuccess) {
                System.out.print("How Much is Today's target : ");
                int target = Scan.nextInt();

                for (int j = 0; j < target; j++) {
                    System.out.println("How many Sims does the " + (j + 1) + " customer Using ? ");
                    int simCount = Scan.nextInt();

                    for (int k = 0; k < simCount; k++) {
                        System.out.println("Enter the " + (k + 1) + " Sim Name : ");
                        String simName = Scan.next();


                        switch (simName) {
                            case "dialog":
                                dialog += 1;
                                break;
                            case "airtel":
                                airtel += 1;
                                break;
                            case "mobitel":
                                mobitel += 1;
                                break;
                            default:
                                System.out.println("Enter a valid sim name");
                        }


                    }


                }


            }

        String maxSim;
        if (dialog >= mobitel && dialog >= airtel) {

            System.out.println("Most popular sim is Dialog " +dialog);

        } else if (mobitel >= dialog && mobitel >= airtel) {
            System.out.println("Most popular sim is Mobitel " +mobitel);
        } else {
            System.out.println("Most popular sim is Airtel " +airtel);
        }

    }



}


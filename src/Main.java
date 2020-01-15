import MERAbank.MeraAtm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int i = 0;
            Scanner sc = new Scanner(System.in);
            MeraAtm obj = new MeraAtm();
            do {
                System.out.println("Please Enter Your PIN");
                int pin = sc.nextInt();
                if (obj.verifyPin(pin)) {
                } else return;
                System.out.println("SHOW Balance -- 1\t Deposit money ----2\t Withdraw Money -----3\t Change PIN----4");
                int temp = sc.nextInt();
                switch (temp) {
                    case 1:
                        obj.showBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to be deposited");
                        double amt = sc.nextDouble();
                        obj.deposit(amt);
                        break;
                    case 3:
                        System.out.println("Enter amount to be Withdrawn");
                        double amot = sc.nextDouble();
                        obj.withdraw(amot);
                        break;
                    case 4:
                        int newpin = sc.nextInt();
                        obj.ChangePin(pin, newpin);
                        break;
                    default:
                        System.out.println("Invaild Option");
                        break;


                }
                System.out.println("\n\n\nDO you want to continue \n NO ---> 0\t YES ---> any other number");
                i = sc.nextInt();
            } while (i != 0);
        } catch (InputMismatchException e) {
            System.out.println("Unrecognisable Input Detected Exiting Automatically");
        }

    }

}

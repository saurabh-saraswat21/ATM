package IOBbank;

import java.util.Scanner;

public class YourAccount {
    long Accountno = 00000;

    public void CreateNewAccount(String Name) {
        Accountno = Accountno + 1;
        System.out.println("Hey " + Name + " Your Account Sucessfully Created Account no is" + Accountno);

    }

    public void CreatePin(int PIN) {
        System.out.println("Re Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int PIN2 = sc.nextInt();
        if (PIN == PIN2) {
            System.out.println("PIN created");

        } else {
            System.out.println("Mismathched");
            CreatePin(PIN);

        }


    }
}

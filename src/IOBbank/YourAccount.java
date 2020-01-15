package IOBbank;

import java.util.Scanner;

public class YourAccount {
    long totalaccounts = 00000;
    int i = 0;
    long AccountArray[][];

    public void CreateNewAccount(String Name) {
        totalaccounts = totalaccounts + 1;
        long Accountno = totalaccounts;
        AccountArray[i][0] = Accountno;
        i = i + 1;
        System.out.println("Hey " + Name + " Your Account Sucessfully Created Account no is" + Accountno);


    }

    public void CreatePin(int PIN) {
        System.out.println("Re Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int PIN2 = sc.nextInt();
        if (PIN == PIN2) {
            System.out.println("PIN created");
            AccountArray[i][1] = PIN;

        } else {
            System.out.println("Mismathched");
            CreatePin(PIN);

        }


    }
}

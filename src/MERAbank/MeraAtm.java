package MERAbank;

import Adt.ATM;

import java.util.Scanner;

public class MeraAtm implements ATM {
    private int Pin = 1234;
    private double AccountBalance = 0000;
    Scanner sc = new Scanner(System.in);

    @Override
    public void ChangePin(int atmpin, int newPin) {
        if (verifyPin(atmpin)) {
            System.out.println("Enter New Pin Again");
            int pin2 = sc.nextInt();
            if (newPin == pin2) {
                this.Pin = pin2;
                System.out.println("PIN Changed");
            }
            return;
        } else {
            System.out.println("Wrong PIN");
            return;

        }
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            this.AccountBalance = amount + AccountBalance;
            System.out.println("Rs." + amount + " Deposited");
            System.out.println("Updated Account Balance is" + AccountBalance);
            return 0;

        } else {
            System.out.println("Please Enter a Vaild Amount");
            return 0;
        }
    }

    @Override
    public double withdraw(double amount) {
        if (AccountBalance > amount) {
            if (amount >= 0) {
                this.AccountBalance = AccountBalance - amount;
                System.out.println("Rs." + amount + " WithDrawn");
                System.out.println("Updated Account Balance is" + AccountBalance);
                return 0;
            } else {
                System.out.println("Amount Cannot be less than 0");
                return 0;
            }
        } else {
            System.out.println("Not Enough Balance");
            return 0;
        }
    }

    @Override
    public boolean verifyPin(int atmPin) {
        if (atmPin == this.Pin) {
            System.out.println("Verified");

            return true;
        } else {
            System.out.println("Wrong PIN");

            return false;
        }
    }

    @Override
    public void showBalance() {
        System.out.println(AccountBalance);
    }
}

package MERAbank;

import Adt.ATM;

public class MERAatm implements ATM {
    @Override
    public double deposit(double amount) {
        System.out.println("Rs." + amount + " Deposited");
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public boolean verifyPin(int atmPin) {
        return false;
    }

    @Override
    public void showBalance() {

    }
}

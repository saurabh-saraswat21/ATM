package IOBbank;

import Adt.ATM;

public class IOBatm implements ATM {
    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public void showBalance() {
        System.out.println(0.0);

    }

    @Override
    public boolean verifyPin(int atmPin) {
        return false;
    }
}

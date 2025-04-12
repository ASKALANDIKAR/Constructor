
package com.Practice;

public class BankService {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100345, "Jay", 10);

        acc1.AccountDetails();

        acc1.deposit(-10);

        acc1.withdraw(50);
        // acc1.withdraw(50);


    }
}

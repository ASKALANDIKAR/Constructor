// Define a BankAccount class with attributes: accountNumber, accountHolder, balance.
//   Implement methods for deposit, withdraw, and displayAccountDetails.
//   Ensure that withdrawal does not allow balance to go negative.
//   Create a Main class to test various transactions.
// BankService.java Content main method in it, to call all the methods.


package com.Practice;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber= accountNumber;
        this.accountHolder= accountHolder;
       this.balance= balance;
    }

    public void deposit(double amount){
        if(amount>=0){
            balance=balance+amount;
            System.out.println("\n"+"Deposited Rs: "+ amount);
            System.out.println("Current Balance: "+balance+"\n\n");
        }
        else {
            System.out.println("\nThe Given Amount is Invalid: "+ amount +"\n");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance) {

            System.out.println("Making Withdraw of amount: " + amount);
            balance = balance - amount;
            System.out.println("Current Balance: " + balance);
        }
        else {
            System.out.println("Making Withdraw of amount: "+amount);
          System.out.println("Can't Make a Withdraw \n Account Balance: "+balance);
        }

    }


    public void AccountDetails(){
        System.out.println("\n"+"Account Number: "+ accountNumber);
        System.out.println("Holder Name: "+ accountHolder);
        System.out.println("Balance: "+balance);


    }


}




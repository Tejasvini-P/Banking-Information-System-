// BankService.java

import java.util.ArrayList;

public class BankService {

    ArrayList<BankAccount> accounts = new ArrayList<>();


    // REGISTER
    public void register(int accNo, String name, String password, double balance) {

        BankAccount account = new BankAccount(accNo, name, password, balance);

        accounts.add(account);

        System.out.println("Account Created Successfully");
    }


    // LOGIN
    public boolean login(int accNo, String password) {

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == accNo && acc.password.equals(password)) {

                System.out.println("Login Successful");
                return true;
            }
        }

        System.out.println("Invalid Account Number or Password");
        return false;
    }


    // DEPOSIT
    public void deposit(int accNo, double amount) {

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == accNo) {

                acc.balance += amount;

                System.out.println("Deposit Successful");
                System.out.println("Current Balance: " + acc.balance);

                return;
            }
        }

        System.out.println("Account Not Found");
    }


    // WITHDRAW
    public void withdraw(int accNo, double amount) {

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == accNo) {

                if(acc.balance >= amount) {

                    acc.balance -= amount;

                    System.out.println("Withdraw Successful");
                    System.out.println("Current Balance: " + acc.balance);

                } else {

                    System.out.println("Insufficient Balance");
                }

                return;
            }
        }

        System.out.println("Account Not Found");
    }


    // CHECK BALANCE
    public void checkBalance(int accNo) {

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == accNo) {

                System.out.println("Current Balance: " + acc.balance);

                return;
            }
        }

        System.out.println("Account Not Found");
    }


    // FUND TRANSFER
    public void transfer(int senderAcc, int receiverAcc, double amount) {

        BankAccount sender = null;
        BankAccount receiver = null;

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == senderAcc) {
                sender = acc;
            }

            if(acc.accountNumber == receiverAcc) {
                receiver = acc;
            }
        }

        if(sender == null || receiver == null) {

            System.out.println("Invalid Account Number");
            return;
        }

        if(sender.balance >= amount) {

            sender.balance -= amount;
            receiver.balance += amount;

            System.out.println("Transfer Successful");

        } else {

            System.out.println("Insufficient Balance");
        }
    }


    // ACCOUNT DETAILS
    public void accountDetails(int accNo) {

        for(BankAccount acc : accounts) {

            if(acc.accountNumber == accNo) {

                System.out.println("===== ACCOUNT DETAILS =====");
                System.out.println("Account Number: " + acc.accountNumber);
                System.out.println("Name: " + acc.name);
                System.out.println("Balance: " + acc.balance);

                return;
            }
        }

        System.out.println("Account Not Found");
    }
}
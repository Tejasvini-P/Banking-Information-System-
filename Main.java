// Main.java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankService bank = new BankService();

        while(true) {

            System.out.println("\n===== BANKING SYSTEM =====");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Fund Transfer");
            System.out.println("7. Account Details");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.register(accNo, name, password, balance);

                    break;


                case 2:

                    System.out.print("Enter Account Number: ");
                    int loginAcc = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPass = sc.nextLine();

                    bank.login(loginAcc, loginPass);

                    break;


                case 3:

                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double depAmount = sc.nextDouble();

                    bank.deposit(depAcc, depAmount);

                    break;


                case 4:

                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withAmount = sc.nextDouble();

                    bank.withdraw(withAcc, withAmount);

                    break;


                case 5:

                    System.out.print("Enter Account Number: ");
                    int balAcc = sc.nextInt();

                    bank.checkBalance(balAcc);

                    break;


                case 6:

                    System.out.print("Enter Sender Account Number: ");
                    int sender = sc.nextInt();

                    System.out.print("Enter Receiver Account Number: ");
                    int receiver = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double transferAmount = sc.nextDouble();

                    bank.transfer(sender, receiver, transferAmount);

                    break;


                case 7:

                    System.out.print("Enter Account Number: ");
                    int detailAcc = sc.nextInt();

                    bank.accountDetails(detailAcc);

                    break;


                case 8:

                    System.out.println("Thank You");
                    System.exit(0);

                    break;


                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
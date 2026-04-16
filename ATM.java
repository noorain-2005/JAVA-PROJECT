import java.util.Scanner;

public class ATM {

    double balance = 1000;
    Scanner sc = new Scanner(System.in);

    public void checkBalance() {
        System.out.println("Your Balance: " + balance);
    }

    public void deposit() {
        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();

        if (deposit > 0) {
            balance += deposit;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw() {
        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance && withdraw > 0) {
            balance -= withdraw;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }
}
import java.util.Scanner;

public class ATMMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer cust = new Customer("Noor", 43562);
        ATM atm = new ATM();

        int choice;

        cust.displayCustomer();

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    atm.deposit();
                    break;

                case 3:
                    atm.withdraw();
                    break;

                case 4:
                    System.out.println("Thank you for using SBI!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
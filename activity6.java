import java.util.Scanner;

public class PasswordSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPIN = "1234";
        boolean isLoggedIn = false;

        // LOGIN SYSTEM (3 attempts only)
        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter PIN: ");
            String pin = input.nextLine();

            if (pin.equals(correctPIN)) {
                System.out.println("Access Granted!");
                isLoggedIn = true;
                break;
            } else {
                if (i == 1) {
                    System.out.println("Attempt 1! Incorrect PIN");
                } else if (i == 2) {
                    System.out.println("Attempt 2! Warning: Last attempt remaining");
                } else {
                    System.out.println("Attempt 3! Card Blocked");
                }
            }
        }

        // SECURITY FEATURE (if failed 3 times)
        if (!isLoggedIn) {
            System.out.println("Card Blocked.");
            System.out.println("Please contact your bank.");
            input.close();
            return; // stop program immediately
        }

        // ATM SYSTEM
        double balance = 1000.00;
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Current Balance: %.2f\n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit successful! New Balance: %.2f\n", balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful! Remaining Balance: %.2f\n", balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM System");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

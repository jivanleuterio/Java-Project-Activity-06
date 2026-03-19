Activity # 6 Instruction – Java Programming

Good day everyone! Please read and follow the instructions carefully.

Step 1: Study the Given Code Pattern

import java.util.Scanner;

public class PasswordSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String correctPassword = "admin123";

        boolean isLoggedIn = false;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Access Granted!");
                isLoggedIn = true;
                break;
            } else {
                System.out.println("Incorrect Password. Attempt " + i + " of 3");
            }
        }

        if (!isLoggedIn) {
            System.out.println("Too many failed attempts.");
            System.out.println("Try after 5 minutes to login again!");
        }
    }
}

2. Modify the Program

Update the program to meet ALL the requirements below:

Login System

	Set password to PIN: 1234

	Allow only 3 attempts

	Display the following messages:

	Attempt 1 → Incorrect PIN

	Attempt 2 → Warning: Last attempt remaining

	Attempt 3 → Card Blocked

After Successful Login

Display a simple ATM Menu using loop + switch:

	1 - Check Balance
	2 - Deposit
	3 - Withdraw
	4 - Exit

ATM Rules

	Starting balance: 1000

	Deposit → add to balance

	Withdraw → check if balance is enough

	If not → display: Insufficient Balance

Security Feature 

If user fails 3 times:

	"Card Blocked."
	"Please contact your bank."

The program must stop immediately after this.

Submission Options:

1. Send the Programiz link of your code (just ping it to my Messenger)
2. Upload your .java file to GitHub and add xen0byt3 as collaborator (recommended)
3. Create a pull request of your file (most recommended)

Make sure your program runs correctly and follows all conditions.

Good luck and enjoy coding! 

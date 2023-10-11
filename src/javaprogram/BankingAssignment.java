package javaprogram;

import java.util.Scanner;

public class BankingAssignment  {
	private static double balance = 1000.0; // Initial balance 


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    System.out.println("Welcome to the Simple Banking Application!");

    while (isRunning) {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                depositMoney(scanner);
                break;
            case 3:
                withdrawMoney(scanner);
                break;
            case 4:
                isRunning = false;
                System.out.println("Thank you for using our banking application!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    scanner.close();
}

private static void checkBalance() {
    System.out.println("Your balance is: ₹" + balance);
}

private static void depositMoney(Scanner scanner) {
    System.out.print("Enter the amount to deposit: ₹");
    double amount = scanner.nextDouble();

    if (amount > 0) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: ₹" + balance);
    } else {
        System.out.println("Invalid amount. Please enter a positive value.");
    }
}

private static void withdrawMoney(Scanner scanner) {
    System.out.print("Enter the amount to withdraw: ₹");
    double amount = scanner.nextDouble();

    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawal successful. Your new balance is: ₹" + balance);
    } else if (amount > balance) {
        System.out.println("Insufficient funds. Your balance is: ₹" + balance);
    } else {
        System.out.println("Invalid amount. Please enter a positive value.");
    }

	}

}

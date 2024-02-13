package customexceptions;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid withdrawal
class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        // Check if the withdrawal amount is negative
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative");
        }
        // Check if the withdrawal amount exceeds the balance
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
        // Perform the withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

// Main class to demonstrate BankAccount functionality
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount instance with initial balance
        BankAccount account = new BankAccount(1000);

        // Demonstrate successful withdrawal
        try {
            account.withdraw(500);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt to withdraw more money than the account balance
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt to withdraw a negative amount
        try {
            account.withdraw(-200);
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


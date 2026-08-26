package exceptions.Custom_exceptions;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Question2 {
    public static void main(String[] args) {
        double balance = 5000;
        double withdraw = 7000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance!"
                );
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
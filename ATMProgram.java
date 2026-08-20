import java.util.Scanner;

class ATM {
    double balance = 5000;

    void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class ATMProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            atm.withdraw(amount);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

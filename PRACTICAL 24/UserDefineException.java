import java.util.Scanner;

class NotSufficientFund extends Exception {
    public NotSufficientFund(String message) {
        System.out.println(message);
    }
}

class Bank {
    private int balance = 0;

    int withdraw(int amount) throws NotSufficientFund {
        if (amount > balance) {
            throw new NotSufficientFund("Not Sufficient Funds");
        } else {
            this.balance = this.balance - amount;
            return balance;
        }
    }

    int deposit(int amount) {
        this.balance = this.balance + amount;
        return balance;
    }
}

public class UserDefineException {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Deposited Amount = " + b.deposit(25000));
        try {
            System.out.println("Widthraw Amount = 20000 | Remaining Amount = " + b.withdraw(20000));
            System.out.println("Widthraw Amount = 4000  | Remaining Amount = " + b.withdraw(4000));
            System.out.println("Widthraw Amount = 20000 | Remaining Amount = " + b.withdraw(20000));
        } catch (NotSufficientFund e) {
        }
    }
}

import java.util.*;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accNum, String holder) {
        this.accountNumber = accNum;
        this.accountHolder = holder;
        this.balance = 0;
    }

    public abstract String getAccountType();

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history for " + accountNumber);
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

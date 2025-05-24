public class SavingsAccount extends Account {
    public SavingsAccount(String accNum, String holder) {
        super(accNum, holder);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

public class CheckingAccount extends Account {
    public CheckingAccount(String accNum, String holder) {
        super(accNum, holder);
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}

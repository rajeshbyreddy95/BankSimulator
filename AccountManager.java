import java.util.*;

public class AccountManager {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accNum, String holder, String type) {
        if (type.equalsIgnoreCase("savings")) {
            accounts.put(accNum, new SavingsAccount(accNum, holder));
        } else if (type.equalsIgnoreCase("checking")) {
            accounts.put(accNum, new CheckingAccount(accNum, holder));
        }
        System.out.println(type + " account created for " + holder);
    }

    public Account getAccount(String accNum) {
        return accounts.get(accNum);
    }

    public boolean accountExists(String accNum) {
        return accounts.containsKey(accNum);
    }
}

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Balance\n5. History\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                String accNum = AccountNumberGenerator.generate();
                System.out.println(accNum);
                System.out.print("Holder Name: ");
                String name = scanner.nextLine();
                System.out.print("Type (savings/checking): ");
                String type = scanner.nextLine();
                manager.createAccount(accNum, name, type);
            } else if (choice == 2 || choice == 3 || choice == 4 || choice == 5) {
                System.out.print("Enter Account Number: ");
                String accNum = scanner.nextLine();
                if (!manager.accountExists(accNum)) {
                    System.out.println("Account not found!");
                    continue;
                }
                Account acc = manager.getAccount(accNum);

                switch (choice) {
                    case 2:
                        System.out.print("Amount to deposit: ");
                        double dep = scanner.nextDouble();
                        acc.deposit(dep);
                        break;
                    case 3:
                        System.out.print("Amount to withdraw: ");
                        double wd = scanner.nextDouble();
                        if (!acc.withdraw(wd)) {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 4:
                        System.out.println("Balance: $" + acc.getBalance());
                        break;
                    case 5:
                        acc.printTransactionHistory();
                        break;
                }
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

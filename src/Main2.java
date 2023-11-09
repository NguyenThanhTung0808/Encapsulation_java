public class Main2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber("VN-03644");
        account.setBalance(2000.0);

        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
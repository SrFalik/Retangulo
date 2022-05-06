package ExercicioObjeto;

public class BankAccount {
    private final Integer accountNumber;
    private String accountName;
    private double balance;

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance = balance - withdraw - 5;
    }

    public BankAccount(Integer accountNumber, String accountName, double accountInicialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(accountInicialDeposit);
    }

    public BankAccount(Integer accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

/**
 * Created by almasics on 2016.12.11..
 */
public class Account implements BankingOperations {

    private int accountNumber;
    private int balance = 0;
    User user;

    @Override
    public void auditMethod() {
    }

    @Override
    public int addDepositToAccount(int depositSum) {
        balance += depositSum;
        return balance;
    }

    public Account(int accountNumber, User user) {
        this.user = user;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return String.format("account number is %d, account balance is %d, Client's name is %s", accountNumber, balance, user);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}

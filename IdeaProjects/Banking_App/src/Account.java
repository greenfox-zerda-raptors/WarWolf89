/**
 * Created by almasics on 2016.12.11..
 */
public class Account implements BankingOperations {

    private int accountNumber;
    private int balance = 0;

    @Override
    public void auditMethod() {
    }

    @Override
    public int addDepositToAccount(int depositSum) {
        balance += depositSum;
        return balance;
    }

    public Account() {

    }

    public Account(int accountNumber, User user) {
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return String.format("account number is %d, account balance is %d", accountNumber, balance);
    }

}

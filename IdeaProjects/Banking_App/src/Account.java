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

    public Account(int accountNumber, int balance, User user) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


}

/**
 * Created by almasics on 2016.12.11..
 */
public class App {

    public static void main(String[] args) {
        User Bob = new User("Bob", "Savage", "1234 Rocky Road to Dublin");
        Account checkingAccount = new Checking(124, Bob);
        checkingAccount.addDepositToAccount(300);
        Bank myBank = new Bank();
        myBank.add(checkingAccount);
        Account savingsAccount = new Savings(125, Bob);
        savingsAccount.addDepositToAccount(200);
        myBank.add(savingsAccount);
        Bank.bankToString(myBank);
        myBank.transferBetweenAccounts(checkingAccount, savingsAccount, 100);
        Bank.bankToString(myBank);
    }
}

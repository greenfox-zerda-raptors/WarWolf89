import java.util.ArrayList;

/**
 * Created by almasics on 2016.12.11..
 */
public class Bank extends ArrayList<Account> {

    public void transferBetweenAccounts(Account firstAccount, Account secondAccount, int sum) {
        int firstAccountBalance = firstAccount.getBalance();
        firstAccount.setBalance(firstAccountBalance += sum);
        int secondAccountBalance = secondAccount.getBalance();
        secondAccount.setBalance(secondAccountBalance -= sum);
    }

    public static void bankToString(Bank bank) {
        for (Account account : bank) {
            System.out.println(account);
        }
    }
}

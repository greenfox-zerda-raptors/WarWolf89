import java.util.ArrayList;

/**
 * Created by almasics on 2016.12.11..
 */
public class App {
    public static void main(String[] args) {
        User Bob = new User("Bob", "Savage", "1234 Rocky Road to Dublin");
        Account checkingAccount = new Checking(124, Bob);
        checkingAccount.addDepositToAccount(300);
        ArrayList<Account> bank = new ArrayList<>();
        bank.add(checkingAccount);
        Account savingsAccount = new Savings(125, Bob);
        bank.add(savingsAccount);

        for (Account bankAccount : bank) {
            System.out.println(bankAccount.toString());
        }
        checkingAccount.addDepositToAccount(300);


    }
}

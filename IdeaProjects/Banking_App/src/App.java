import java.util.ArrayList;

/**
 * Created by almasics on 2016.12.11..
 */
public class App {
    public static void main(String[] args) {
        User Bob = new User("Bob", "Savage", "1234 Rocky Road to Dublin");
        Checking checkingAccount = new Checking(124, Bob);
        ArrayList<Account> bank = new ArrayList<>();
        bank.add(checkingAccount);

        for (Account bankAccount : bank) {
            System.out.println(bankAccount.toString());
        }

    }
}

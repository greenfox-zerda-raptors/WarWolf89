/**
 * Created by almasics on 2016.12.11..
 */
public class Savings extends Account {

    public Savings(int number, User user) {
        super(number, user);
    }

    @Override
    public void auditMethod() {
        super.auditMethod();
        System.out.println("Audit method for Savings account");
    }
}

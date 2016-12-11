/**
 * Created by almasics on 2016.12.11..
 */
public class User {
    String firstName;
    String lastName;
    String adress;

    public User(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String toString() {
        return String.format(" %s %s, adress is %s", firstName, lastName, adress);
    }
}

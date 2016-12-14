import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by almasics on 2016.12.14..
 */
@DatabaseTable(tableName = "accounts")

public class Account {


    @DatabaseField(id = true)
    private String name;

    @DatabaseField
    private String password;

    @DatabaseField(foreign = true)
    private Address address;

    public Account() {

    }

    public Account(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public String toString() {
        return String.format("Account name: %s, password: %s, adress_id: %s", name, password, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}

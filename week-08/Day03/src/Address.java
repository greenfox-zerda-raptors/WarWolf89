/**
 * Created by almasics on 2016.12.14..
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "adresses")

public class Address {


    public String getAdress_id() {
        return adress_id;
    }

    @DatabaseField(id = true)
    private String adress_id;

    @DatabaseField
    private String street;

    @DatabaseField
    private String city;

    @DatabaseField
    private String postalCode;

    @DatabaseField
    private String country;

    public Address() {

    }

    public Address(String street, String city, String postalCode, String country, String adress_id) {
        this.adress_id = adress_id;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String toString() {
        return String.format("address_id: %s postcode: %s \n city: %s \n country: %s \n street: %s\n", adress_id, postalCode, city, country, street);
    }
}

/**
 * Created by almasics on 2016.12.14..
 */

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class Workshop03 {
    public static void main(String[] args) throws SQLException {

        String databaseUrl = "jdbc:mysql://localhost:3306/workshop03?user=root&password=9wZddh89&serverTimezone=UTC&useSSL=false";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);
        Dao<Address, String> addressDao =
                DaoManager.createDao(connectionSource, Address.class);

        Address address = new Address("Andrássy", "Budapest", "1064", "Hungary", "1");
        Account account = new Account("Captain America", "uejnsd632**234.", address);

        createAccountIfNotExists(accountDao, account);
        createAddressIfNotExists(addressDao, address);
        
        System.out.println(account.toString());
        System.out.println(address.toString());
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if (accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }

    private static void createAddressIfNotExists(Dao<Address, String> addressDao, Address acc) throws SQLException {
        if (addressDao.queryForId(acc.getAdress_id()) == null) {
            addressDao.create(acc);
        }
    }
}

/**
 * Created by almasics on 2016.12.14..
 */

//import com.j256.ormlite.dao.Dao;
//import com.j256.ormlite.dao.DaoManager;
//import com.j256.ormlite.jdbc.JdbcConnectionSource;
//import com.j256.ormlite.support.ConnectionSource;
//import com.j256.ormlite.table.TableUtils;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Workshop02 {
//    public static void main(String[] args) throws SQLException {
//
//        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=9wZddh89&serverTimezone=UTC&useSSL=false";
//        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
//        TableUtils.createTableIfNotExists(connectionSource, Account.class);
//
//        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);
//
//        ArrayList<Account> heroList = new ArrayList<>();
//        ArrayList<String> heronameslist = new ArrayList<>(Arrays.asList("Captain America", "Iron Man", "Wolverine", "Hulk", "Loki"));
//
//        for (int i = 0; i <= 4; i++) {
//            Account account = new Account(heronameslist.get(i), String.format("uejnsd632**23%d.", i), );
//            createAccountIfNotExists(accountDao, account);
//            account = accountDao.queryForId(heronameslist.get(i));
//            heroList.add(account);
//        }
//    }
//
//    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
//
//        if (accountDao.queryForId(acc.getName()) == null) {
//            accountDao.create(acc);
//        }
//    }
//}

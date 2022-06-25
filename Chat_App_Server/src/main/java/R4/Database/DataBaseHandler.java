package R4.Database;
//STEP 1. Import required packages
import R4.Utillity.ConfigLoader;

import java.sql.*;

public class DataBaseHandler {
    // JDBC driver name and database URL

    private final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private final String DB_PREFIX = "jdbc:mariadb://";
    private final String IP_HOST_NAME = ConfigLoader.retrieveProperty("DB_IP_HOSTNAME");
    private final String DB_NAME = "/" + ConfigLoader.retrieveProperty("DB_NAME");

    private final String DB_URL = DB_PREFIX + IP_HOST_NAME + DB_NAME;

    //  Database credentials
    static final String USER = ConfigLoader.retrieveProperty("DB_USER");
    static final String PASS = ConfigLoader.retrieveProperty("DB_PASS");

    private Connection dbConnection;

    public DataBaseHandler(){
        dbConnection = createConnection();
        //initUserTable();
        showTables();
    }



    private Connection createConnection() {

        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException sql) {
            sql.printStackTrace();
        }
        return connection;
    }

    private void showTables(){
        try {
            Statement statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery("SHOW TABLES");
            System.out.println(rs.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void initUserTable(){
        Statement dbStatement = null;
        try {
            dbStatement = dbConnection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "CREATE TABLE USER "
                + "(id INTEGER not NULL, "
                + " email VARCHAR(255), "
                + " passHash VARCHAR(255), "
                + " username VARCHAR(255), "
                + " tempPassHash VARCHAR(255), "
                + " PRIMARY KEY ( id ))";

        try {
            dbStatement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



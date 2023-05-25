package usedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/leyl_2023_java_2";
    private final String username = "sa";
    private final String password = "sa";

    private Connection connection = null;
    public Connection conn() {
        try {
            if ( connection == null || connection.isClosed() ) {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Success");
            }
        }catch (Exception ex) {
            System.err.println("Connection Error :" + ex);
        }
        return connection;
    }

    public void close() {
        try {
            if ( connection != null && !connection.isClosed() ) {
                connection.close();
                System.out.println("Connection Close Success");
            }
        }catch (Exception ex) {
            System.err.println("Connection Close Error :" + ex);
        }
    }


}

package objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static List<Connection> connectionList = new ArrayList<>();

    public ConnectionPool() {
        init();
    }

    public void init() {
        for (int i = 0; i < 3; i++) {
            connectionList.add( new Connection() );
        }
    }

    public static Connection getConnection() {
        if ( connectionList.size() == 0 ) {
            throw new RuntimeException("Not Found Object");
        }

        Connection instance = connectionList.get(0);
        connectionList.remove(instance);
        return instance;
    }

    public static void relase( Connection connection ) {
        if ( connection != null ) {
            connectionList.add(connection);
        }
    }


}

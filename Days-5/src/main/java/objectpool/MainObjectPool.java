package objectpool;

public class MainObjectPool {
    public static void main(String[] args) {

        new ConnectionPool();

        Connection c1 = ConnectionPool.getConnection();
        Connection c2 = ConnectionPool.getConnection();
        Connection c3 = ConnectionPool.getConnection();


        c1.connect();
        c2.connect();
        c3.connect();

        ConnectionPool.relase(c1);
        Connection c4 = ConnectionPool.getConnection();
        c4.connect();



    }
}

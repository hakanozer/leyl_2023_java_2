package objectpool;

public class Connection {

    public void connect() {
        System.out.println( "Connect : " + this.hashCode() );
    }

}

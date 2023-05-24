package useAbstract;

public abstract class Customer {

    public abstract int accountNumber();

    public int total() {
        int total = 0;
        if ( accountNumber() == 100 ) {
            total = 1000000;
        }else if ( accountNumber() == 200 ) {
            total = 2000000;
        }
        return total;
    }

    public String name() {
        String name = "";
        if ( accountNumber() == 100 ) {
            name = "Ali Bilmem";
        }else if ( accountNumber() == 200 ) {
            name = "Erkan Bilsin";
        }
        return name;
    }

}

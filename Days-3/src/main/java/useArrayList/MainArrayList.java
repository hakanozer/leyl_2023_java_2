package useArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {

        List<Product> ls = new ArrayList<>();

        Product p1 = new Product(100, "TV", 20000);
        Product p2 = new Product(101, "Bilgisayar", 35000);
        Product p3 = new Product(102, "iPhone 14", 55000);

        ls.add(p1);
        ls.add(p2);
        ls.add(p3);

        for( Product item : ls ) {
            System.out.println( item.getPid() );
        }

        System.out.println( ls );

    }
}

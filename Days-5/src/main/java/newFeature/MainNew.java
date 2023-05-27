package newFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainNew {
    public static void main(String[] args) {

        ProductResult productResult = new ProductResult();
        List<Product> ls = productResult.result(250000);

        /*
        List<Product> lsx = new ArrayList<>();
        ls.forEach( item -> {
            if ( item.getPrice() > 100 ) {
                lsx.add(item);
            }
        });
         */

        long start = System.currentTimeMillis();
        ls
        .parallelStream()
        //.filter( item -> item.getPrice() > 100 )
        //.filter( item -> item.getTitle().contains("ab") )
        .forEach( item -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println( item );
            }catch (Exception ex) {}
        });
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println( "between :" + between );




    }
}

/*
    stream - 25000 -> between :32217
    paralelStream - 250000 -> between :39777
*/
package useArrayList;

import java.util.*;

public class MainArrayList {
    public static void main(String[] args) {

        // ArrayList Mutable özelliğe sahip bir dizidir
        List<String> ls = new ArrayList<>();

        // item add
        ls.add("İstanbul");
        ls.add("İzmir");
        ls.add("Ankara");
        ls.add("Kayseri");
        ls.add("İzmit");
        ls.add("Samsun");

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("City -1 Entry!");
        String city1 = scanner.nextLine();
        ls.add(city1);

        System.out.println("City -2 Entry!");
        String city2 = scanner.nextLine();
        ls.add(city2);
        */

        // index add item
        ls.add( 1,"Adana");

        // get index
        System.out.println( ls.get(1) );

        // size
        System.out.println( ls.size() );

        // get all items
        for( int i = 0; i < ls.size(); i++ ) {
            System.out.println( ls.get(i) );
        }

        System.out.println("==================");
        for ( String item : ls ) {
            System.out.println(item);
        }
        System.out.println("==================");

        // delete item
        ls.remove("Adanax");
        int deleteIndex = -1;
        if ( ls.size() > deleteIndex && deleteIndex >= 0 ) {
            ls.remove(deleteIndex);
        }
        List<String> removeList = new ArrayList<>();
        removeList.add("İstanbul");
        removeList.add("Kayseri");
        removeList.add("Samsun");
        //ls.removeAll(removeList);

        // all item clear
        // ls.clear();

        // item contains
        boolean containsStatus = ls.contains("Ankara");
        System.out.println( containsStatus );

        // items contains
        boolean containsAllStatus = ls.containsAll(removeList);
        System.out.println( containsAllStatus );

        // index search
        int indexContaines =  ls.indexOf("Kayseri");
        System.out.println(indexContaines);

        // item set - update
        String izmir = ls.set(2, "Çeşme");
        System.out.println( izmir );

        Collections.sort(ls);
        Collections.reverse(ls);

        // sublis -> listeninde içindeki belirli bir bölümü getir
        // 1. parametre -> kaçıncı itemdan başlanacak(0 dan başlar)
        // 2. parametre -> toplamda üzerinde işlem sergilecek item sayısıdır.
        List<String> subList = ls.subList(1,5);
        System.out.println(subList);

        // toArray -> diziye dönüştürçe
        Object[] arrObj = ls.toArray();
        for ( Object item : arrObj ) {
            String stItem = String.valueOf(item);
            System.out.println("item : " + stItem);
        }

        System.out.println("================");
        String[] arrString = ls.toArray(new String[]{});
        System.out.println( arrString[0] );

        // iterator
        System.out.println("================");
        Iterator<String> iterator = ls.iterator();
        while ( iterator.hasNext() ) {
            String item = iterator.next();
            System.out.println( item );
        }

        System.out.println("================");
        while ( iterator.hasNext() ) {
            String item = iterator.next();
            System.out.println( item );
        }

        System.out.println("================");
        ls.forEach( item -> {
            System.out.println("item : -" + item );
        });

        System.out.println( ls );
    }
}

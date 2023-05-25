package useSet;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {

        // Benzersiz değerlerin/nesnelerin barındırılması için kullanılır
        Set<String> set = new HashSet<>();

        long start = System.currentTimeMillis();
        set.add("İstanbul");
        set.add("Ankara");
        set.add("Ankara");
        set.add("Ankara");
        set.add("İstanbul");
        set.add("İzmir");
        set.add("Antalya");
        set.add("Antalya");
        set.add("Antalya");
        set.add("Antalya");
        System.out.println( set );
        long end = System.currentTimeMillis();
        System.out.println( end - start );


        Set<String> xset = new LinkedHashSet<>();
        start = System.currentTimeMillis();
        xset.add("Ali");
        xset.add("Ali");
        xset.add("Ali");
        xset.add("Kemal");
        xset.add("Kemal");
        xset.add("Serkan");
        xset.add("Serkan");
        xset.add("Erkan");
        xset.add("Erkan");
        xset.add("Erkan");
        System.out.println( xset );
        end = System.currentTimeMillis();
        System.out.println( end - start );


        // Hashmap eklediğimiz sıralamaya göre planlanması
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("name", "Ali");
        hm.put("surname", "Bilmem");
        hm.put("status", true);
        hm.put("email", "ali@mail.com");
        System.out.println( hm );

    }
}

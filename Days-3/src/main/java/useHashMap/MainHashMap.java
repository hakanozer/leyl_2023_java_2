package useHashMap;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        Map<String, Object> hm = new HashMap<>();

        // item add
        hm.put("name", "Erkan");
        hm.put("name", "Serkan");
        hm.put("surname", "Bilsin");
        hm.put("age", 22);
        hm.put("status", true);
        hm.put("number", 10.2);

        //  get item
        System.out.println( hm.get("surname") );

        // remove item
        hm.remove("statu");

        // key all
        Set<String> keys = hm.keySet();
        for( String key : keys ) {
            System.out.println( key + " " + hm.get(key) );
        }

        System.out.println("===============================");
        Set<Map.Entry<String, Object>> keyVals = hm.entrySet();
        for(Map.Entry<String, Object> item : keyVals ) {
            System.out.println( item.getKey() + " " + item.getValue() );
        }
        System.out.println("===============================");
        hm.entrySet().forEach( item -> {
            System.out.println( item.getKey() + " - " + item.getValue() );
        });

        // size
        System.out.println(hm.size());

        // replace
        hm.replace("status", false);

        // default value
        Object obj = hm.getOrDefault("name", "ali@mail.com");
        System.out.println(obj);
        System.out.println( hm );

        System.out.println("===============================");
        // Enum Hashmap
        Map<EMap, Object> hmx = new HashMap<>();
        hmx.put(EMap.name, "Serkan");
        hmx.put(EMap.surname, "Bilsin");
        hmx.put(EMap.email, "serkan@mail.com");
        hmx.put(EMap.age, 33);
        hmx.put(EMap.status, true);
        System.out.println(hmx.get(EMap.name));
        System.out.println(hmx);

        List<Map<EMap, Object>> ls = new ArrayList<>();
        ls.add(hmx);
        ls.add(hmx);
        ls.add(hmx);
        System.out.println( ls );
    }
}

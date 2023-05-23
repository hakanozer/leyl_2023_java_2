package com.lely;

import com.lely.utils.EAction;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {

        String name = "Erkan";
        int age = 30;


        // Array
        // unmutable
        String[] cities = { "İstanbul", "Ankara", "İzmir", "Bursa", "Adana", "Mersin" };

        // index -> 0'dan başlar
        // Dizideki her bir elemanın sayısal değeridir.

        // index değerinin değişmesi
        cities[4] = "Kayseri";
        String item_0 = cities[4];
        System.out.println(item_0);

        // all item
        System.out.println( cities );

        // loop
        for( int i = 0; i < 10; i++ ) {
            System.out.println("i :  " + i);
        }

        // array  loop
        for( int i = 0; i < cities.length; i++ ) {
            String city = cities[i];
            System.out.println( city );
            if ( city.equals("Ankara") ) {
                System.out.println( "== Başkent ==" );
            }
        }

        System.out.println("====================");
        // foreach
        for ( String item : cities ) {
            if ( item.equals("Ankara") ) {
                continue; // bu adımı atla sıradaki item ile devam et
            }
            if ( item.equals("Bursa") ) {
                break; // for döngüsünü bitir
            }
            System.out.println( item );
        }
        System.out.println("====================");
        // && -> koşulu iki kıyaslamanında aynı anda geçerli olduğu
        int number_1 = 40;
        int number_2 = 41;
        if ( number_1 == 40 && number_2 == 41 ) {
            System.out.println( "Success" );
        }else {
            System.out.println( "Fail" );
        }

        // || -> koşullardan herhangi biri geçerli olduğunda
        if ( number_1 > 39 || number_2 == 50 ) {
            System.out.println( "Success" );
        }else {
            System.out.println( "Fail" );
        }

        System.out.println("====================");
        // switch -> else durumlarının aranmadığı hallerde kullanılır.
        // örn: hangi mevsimdeyiz, kullanıcı hangi butona tıkladı..
        String day = "Salı";
        switch (day) {
            case "Pazartesi":
                System.out.println("Pazartesi Select");
                break;
            case "Salı":
                System.out.println("Salı Select");
                break;
            case "Çarşamba":
                System.out.println("Çarşamba Select");
                break;
            default:
                System.out.println("Fail Day");
        }

        System.out.println("====================");
        // Else - if -> form doğrulama işlemleri için, vb..
        String username = "";
        String password = "";

        if ( username.equals("") ) {
            System.out.println("username empty!");
        }else if( password.equals("") ) {
            System.out.println("password empty!");
        }else {
            System.out.println("Form Send..");
        }

        // OOP
        System.out.println("====================");
        // object -> nesne üreti
        // Class -> Sınıf

        // obj -> nesne-> sınıf içindeki yeteneklerin kullanılması için gereklidir.
        // Action -> üretilecek olan türdür.
        // Action() -> sınıfın kurucu methodudur.
        // nesne altındaki özelliklere (.) operatörü ile kullanım sağlanır.
        Action obj = new Action();
        System.out.println( obj.profileName );
        obj.loginStatus();
        String title = obj.appName();
        System.out.println( title );

        int callEnd = obj.call(77,66, EAction.sum);
        System.out.println( callEnd );

    }

}

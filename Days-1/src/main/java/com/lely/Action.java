package com.lely;

import com.lely.utils.EAction;
import com.lely.utils.Profile;

public class Action {

    String profileName = "Ali Bilmem";

    // Fonksiyonlar
    // void -> bir fonksiyon geriye yanıt döndermiyor ise void belirtilmek zorundadır.
    // return -> bir fonksiyon geriye yanıt gönderiyor ise return karşısında mutlaka o türe uygun bir data/nesne belirtilmelidir.
    // parametre -> bir fonksiyona gidecek data/nesne leri ifade eder.

    public void loginStatus() {
        System.out.println("loginStatus Call");
    }

    public String appName() {
        return "App Title";
    }

    public int call( int num1, int num2, EAction eAction ) {
        /*
        if( eAction == EAction.sum ) {
            return num1 + num2;
        }
        if ( eAction == EAction.minus ) {
            return num1 - num2;
        }
        return 0;
         */
        switch (eAction) {
            case sum:
                return num1 + num2;
            case minus:
                return num1 - num2;
            default:
                return 0;
        }
    }


    public void changeProfile(Profile profile) {
        profile.userUpdate(10, "ali@mail.com");
    }


    // add lines
    public void lines( String... lines ) {
        for ( String line : lines ) {
            System.out.println( line );
        }
    }

    public Profile getProfile( String surname ) {
        Profile profile = new Profile();
        profile.surname = surname;
        return profile;
    }

    /**
     * @apiNote Name Surname Joinv
     * @param name
     * @param surname
     * @return String[]  (name + surname)
     * @throws RuntimeException
     * @author Ali Bilmem -> ali@mail.com
     * @since 1.8
     * @Lely https://www.lely.com
     */
    public String[] allArr( String name, String surname )  {
        name = "Sn. " + name;
        surname = " " + surname;
        String[]  arr = { name, surname };
        return arr;
    }

}

package com.lely;

import com.lely.utils.EAction;

public class Action {

    String profileName = "Ali Bilmem";

    // Fonksiyonlar
    // void -> bir fonksiyon geriye yanıt döndermiyor ise void belirtilmek zorundadır.
    // return -> bir fonksiyon geriye yanıt gönderiyor ise return karşısında mutlaka o türe uygun bir data/nesne belirtilmelidir.
    // parametre

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


}

package com.lely;

public class Customer {

    // Kurucu methodlar
    // Sınıf adı ile aynı isme sahip olmalıdırılar.
    // Void yada Return anahtar kelimesi almazlar.
    // parametre alabilirler.
    // Bir kurucu method yazıldığında object sınıfından gelen boş kurucu egale olur.

    // this -> kullanıldığı methodun sınıfını işaret eder.

     private String name = "";
     private int age = 0;

    public Customer() {
        resend("Re Send Data...");
    }

    public Customer( String name ) {
        this.name = name;
    }

    public Customer( String name, int age ) {
        this.name = name;
        this.age = age;
    }


    public void profile() {
        System.out.println( name + " " + age );
    }

    public int size() {
        return name.length();
    }

    public void call() {

    }

    public int call(String st) {
        return 100;
    }

    public int call(int number) {
        return 100 * number;
    }

    private void resend( String sendData ) {
        System.out.println(sendData);
    }


}

package keywords;

public class UseStatic {

    // static
    // bu anahtar kelime ile oluşturulan nesne, değişken, method vb. özellikler uygulama kapatılmadığı sürece yaşarlar.
    // erişim belirteci uygun olduğu sürece her yerden erişime uygundur. (Nesne üretim işlemi olmadan.)

    public static void main(String[] args) {

        // Invoce invoce = new Invoce();
        System.out.println( Invoce.desc );
        Invoce.print();

    }
}

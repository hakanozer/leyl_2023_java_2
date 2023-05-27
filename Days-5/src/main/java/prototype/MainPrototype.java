package prototype;

public class MainPrototype {

    public static void main(String[] args) throws Exception {

        HomeAddress home = new HomeAddress("Ali Bilmem", "İstanbul", "Beşiktaş", "10");
        home.printAddress();

        Object obj = home.clone();
        if ( obj instanceof AddressPrototype ) {
            AddressPrototype adr = (AddressPrototype) obj;
            adr.setTitle("App Ltd. Şti.");
            adr.setEmail("app@mail.com");
            adr.printAddress();
        }


    }

}

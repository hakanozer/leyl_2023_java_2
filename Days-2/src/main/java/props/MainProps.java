package props;

public class MainProps {
    public static void main(String[] args) {

        User u1 = new User("Ali", "Bilmem", "ali@mail.com");
        User u2 = new User("Selin", "Bilsin", "selin@mail.com");
        User u3 = new User("Serkan", "Bilki", "serkan@mail.com");

        User[] users = { u1, u2, u3 };

        for( User item : users ) {
            System.out.println( item.toString() );
        }


    }
}

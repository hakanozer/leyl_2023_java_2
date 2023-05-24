package useAbstract;

public class MainAbstract {
    public static void main(String[] args) {

        Person person = new Person(200);
        System.out.println( person.name() + " " + person.total() );

        /*
        Customer customer = new Customer() {
            @Override
            public int accountNumber() {
                return 0;
            }
        };
         */

    }
}

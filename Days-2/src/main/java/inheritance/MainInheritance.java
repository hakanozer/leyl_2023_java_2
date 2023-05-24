package inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        Base a = new A();
        Base b = new B();
        Base c = new C();

        fncCall(a);
        fncCall(b);
        fncCall(c);

    }

    public static void fncCall( Base base ) {
        System.out.println( base.call() );
    }

}

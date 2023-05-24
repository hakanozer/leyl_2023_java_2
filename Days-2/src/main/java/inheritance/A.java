package inheritance;

public class A extends Base {

    @Override
    public int call() {
        return action(10,10);
    }

    public void sum( int a, int b ) {
        int sm = a + b;
        System.out.println( "Sum :" + sm );
    }
}

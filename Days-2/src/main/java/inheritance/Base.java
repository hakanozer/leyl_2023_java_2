package inheritance;

public class Base {

    // değişime açık method
    public int call() {
        return action(5,5);
    }

    // değişime kapalı -> hizmet methodları
    public int action( int num1, int num2 ) {
        return num1 * num2;
    }

}

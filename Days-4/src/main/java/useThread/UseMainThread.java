package useThread;

public class UseMainThread {
    public static void main(String[] args) {

        int status = 0;
        for(;;) {
            if (status > 10) break;
        }
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum : " + sum);


    }
}

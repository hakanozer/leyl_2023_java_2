package useThread;

public class UseMainThread {
    public static void main(String[] args) {

        Action action1 = new Action("image-1.jpg");
        Thread th1 = new Thread(action1);
        th1.start();

        Action action2 = new Action("image-2.jpg");
        Thread th2 = new Thread(action2);
        th2.start();

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum : " + sum);


    }
}

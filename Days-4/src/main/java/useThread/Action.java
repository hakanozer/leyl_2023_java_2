package useThread;

public class Action implements Runnable {

    private String imagePath = "";
    public Action(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(imagePath + " - Upload");
            }catch (Exception ex) {}
        }
    }

}

package useInterface;

public class MainInterface {
    public static void main(String[] args) {

        IProfile profile = new ProfileImpl();
        String name = profile.userProfileName(10);
        System.out.println( name );


    }
}

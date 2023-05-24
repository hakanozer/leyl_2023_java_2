package useInterface;

public class MainInterface {
    public static void main(String[] args) {

        IProfile profile = new ProfileImpl();
        String name = profile.userProfileName(10);
        System.out.println( name );

        IUser userProfile = new ProfileImpl();
        userProfile.userPasswordChange(10, "12345", "54321");

    }
}

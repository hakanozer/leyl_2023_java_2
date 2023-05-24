package useInterface;

public class ProfileImpl implements IProfile {

    @Override
    public String userProfileName(int userID) {
        userStatus(userID);
        if (  userID == 10 )
            return "Serkan Bilsin";
        return null;
    }

    @Override
    public int userProfileStar(int userID) {
        if (  userID == 10 )
            return 101;
        return 0;
    }

    @Override
    public int userProfileVisit(int userID) {
        if (  userID == 10 )
            return 1566;
        return 0;
    }

    public void call() {
        System.out.println("Call Line");
    }

    @Override
    public boolean userPasswordChange(int userID, String oldPassword, String newPassword) {
        return false;
    }

}

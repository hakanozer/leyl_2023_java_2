package useInterface;

public interface IProfile extends IUser {

    String userProfileName( int userID );
    int userProfileStar( int userID );
    int userProfileVisit( int userID );

    default public boolean userStatus( int userID ) {
        return true;
    }

}

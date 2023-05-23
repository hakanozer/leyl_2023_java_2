package com.lely.utils;

public class Profile {

    protected String name = "Zehra";

    public String surname = "";

    public void userUpdate(int userId, String email) {
        System.out.println(userId + " Update Email : " + email );
    }

}

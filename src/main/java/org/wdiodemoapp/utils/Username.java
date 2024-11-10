package org.wdiodemoapp.utils;

//This class to get machine's user

public class Username {
    public  String getUserName(){
        return System.getProperty("user.name");
    }
}

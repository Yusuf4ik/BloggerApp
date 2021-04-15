package itacademy.kg.bloggerapp;

import android.content.Intent;

import java.util.ArrayList;


public class ListDB {
    static ArrayList<userInfo> userList = new ArrayList<>();

    public static ArrayList<userInfo> getUserList() {
        return userList;
    }
}

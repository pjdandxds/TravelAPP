package com.travelapp.travel.model;

public class UserExm {
    private int uid;
    private String username;
    private String password;
    private String head;

    public UserExm(int uid, String username, String password, String head) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.head = head;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}

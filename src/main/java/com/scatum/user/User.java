package com.scatum.user;

public class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}

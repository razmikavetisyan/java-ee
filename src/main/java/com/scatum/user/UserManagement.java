package com.scatum.user;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    public static User currentUser;

    private static List<User> usersList = new ArrayList<>();

    public static User getUserWith(String username, String password) {

        for (User user : usersList) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }

        return null;
    }


    public static void loadDefaultUsers() {
        User user1 = new User("Razmik", "razmik11");
        User user2 = new User("Aramazd", "aramazd22");

        usersList.add(user1);
        usersList.add(user2);

    }
}

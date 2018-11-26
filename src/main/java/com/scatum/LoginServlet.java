package com.scatum;

import com.scatum.user.User;
import com.scatum.user.UserManagement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("Entered get method !!!");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.err.println("Entered post method !!!");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = UserManagement.getUserWith(username, password);
        if (user == null) {
            request.setAttribute("errorMessage", "You don't have access !!!  Please register in our application !");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        UserManagement.currentUser = user;

//        request.setAttribute("user", user);
        request.getRequestDispatcher("user-page.jsp").forward(request, response);
    }


}

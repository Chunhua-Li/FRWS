package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataaccesslayer.UserDAO;
import model.User;

public class LoginServlet extends HttpServlet {
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        // Retrieve user from database using email
        User user = userDAO.getUserByUserName(userName);

        if (user != null && user.getPassword().equals(password)) {
            // If username and password match, determine the appropriate page to redirect based on user type
            String userType = user.getUserType();
            switch (userType) {
                case "1" -> response.sendRedirect("retailer_home.jsp");
                case "2" -> response.sendRedirect("consumer_home.jsp");
                case "3" -> response.sendRedirect("charity_home.jsp");
                default -> response.sendRedirect("index.jsp"); // Default redirect if user type is not recognized
            }
        } else {
            // If login fails, forward the user back to the login page with an error message
            request.setAttribute("errorMessage", "Invalid UserName or password. Please try again.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
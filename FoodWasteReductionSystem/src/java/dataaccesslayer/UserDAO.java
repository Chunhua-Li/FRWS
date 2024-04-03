package dataaccesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;


public class UserDAO {
    
    private Connection con = null;

    public UserDAO() {
        con = DBConnection.getConnection();
    }

    public boolean addUser(User user) {
        
        String query = "INSERT INTO user (userName, password, firstName, lastName, userType, email) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());    
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());  
            preparedStatement.setString(5, user.getUserType());
            preparedStatement.setString(6, user.getEmail());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public User getUserByUserName(String userName) {
        String query = "SELECT * FROM user WHERE userName = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, userName);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setUserType(rs.getString("userType"));
                user.setEmail(rs.getString("email"));                
                
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }    
    
    
}

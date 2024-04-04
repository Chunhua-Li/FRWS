/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import dataaccesslayer.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Food;

/**
 *
 * @author lchca
 */
public class ListSurplusFood {

    private Connection connection = null;

    public ListSurplusFood(Connection connection) {
        connection = DBConnection.getConnection();
    }
    // Method to list surplus food items

    public List<Food> listSurplusFood() throws SQLException {
        List<Food> surplusFoodItems = new ArrayList<>();
        String query = "SELECT * FROM foodInventory WHERE isSurplusFood = 1";
        try (Statement statement = connection.createStatement(); 
                ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Food foodItem = new Food(
                        resultSet.getInt("foodId"),
                        resultSet.getString("foodName"),
                        resultSet.getString("foodDescription"),
                        resultSet.getFloat("foodPrice"),
                        resultSet.getInt("foodQuantity"),
                        resultSet.getDate("foodExpirationDate"),
                        resultSet.getString("category"),
                        resultSet.getBoolean("isSurplusFood")
                );
                surplusFoodItems.add(foodItem);
            }
        }
        return surplusFoodItems;
    }
}

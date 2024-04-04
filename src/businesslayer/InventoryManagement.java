/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

/**
 *
 * @author lchca
 */

import dataaccesslayer.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Food;

public class InventoryManagement {
    private Connection connection = null;

    public InventoryManagement(Connection connection) {
        connection = DBConnection.getConnection();
    }

    // Method to add a new food item to the inventory
    public void addFoodItem(Food food) throws SQLException {
        String query = "INSERT INTO foodInventory (foodName, foodDescription, foodPrice, foodQuantity, foodExpirationDate, category, isSurplusFood) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, food.getFoodName());
            statement.setString(2, food.getFoodDescription());
            statement.setFloat(3, food.getFoodPrice());
            statement.setInt(4, food.getFoodQuantity());
            statement.setDate(5, new Date(food.getFoodExpirationDate().getTime()));
            statement.setString(6, food.getCategory());
            statement.setBoolean(7, food.isIsSurplusFood());
            statement.executeUpdate();

            // Retrieve the auto-generated foodId
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int foodId = generatedKeys.getInt(1);
                food.setFoodID(foodId);
            }
        }
    }

    // Method to update an existing food item in the inventory
    public void updateFoodItem(Food food) throws SQLException {
        String query = "UPDATE foodInventory SET foodName=?, foodDescription=?, foodPrice=?, foodQuantity=?, foodExpirationDate=?, category=?, isSurplusFood=? WHERE foodId=?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, food.getFoodName());
            statement.setString(2, food.getFoodDescription());
            statement.setFloat(3, food.getFoodPrice());
            statement.setInt(4, food.getFoodQuantity());
            statement.setDate(5, new Date(food.getFoodExpirationDate().getTime()));
            statement.setString(6, food.getCategory());
            statement.setBoolean(7, food.isIsSurplusFood());
            statement.setInt(8, food.getFoodID());
            statement.executeUpdate();
        }
    }

    // Method to remove a food item from the inventory
    public void removeFoodItem(int foodId) throws SQLException {
        String query = "DELETE FROM foodInventory WHERE foodId=?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, foodId);
            statement.executeUpdate();
        }
    }

    // Method to retrieve all food items from the inventory
    public List<Food> getAllFoodItems() throws SQLException {
        List<Food> foodItems = new ArrayList<>();
        String query = "SELECT * FROM foodInventory";
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
                foodItems.add(foodItem);
            }
        }
        return foodItems;
    }
}



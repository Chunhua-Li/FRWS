/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author lchca
 */
public class Food{
 
	private int foodID;
	private String foodName;
        private String foodDescription;
	private float foodPrice;
	private int foodQuantity;
	private Date foodExpirationDate;
	private String category;	
        private boolean isSurplusFood;

    public Food(int foodID, String foodName, String foodDescription, float foodPrice, int foodQuantity, Date foodExpirationDate, String category, boolean isSurplusFood) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodQuantity = foodQuantity;
        this.foodExpirationDate = foodExpirationDate;
        this.category = category;
        this.isSurplusFood = isSurplusFood;
    }

   
    public Integer getFoodID() {
        return foodID;
    }

    public void setFoodID(Integer foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public Float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(Integer foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Date getFoodExpirationDate() {
        return foodExpirationDate;
    }

    public void setFoodExpirationDate(Date foodExpirationDate) {
        this.foodExpirationDate = foodExpirationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }   

    public boolean isIsSurplusFood() {
        return isSurplusFood;
    }

    public void setIsSurplusFood(boolean isSurplusFood) {
        this.isSurplusFood = isSurplusFood;
    }
}
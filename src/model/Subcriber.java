/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lchca
 */
public class Subcriber {
    private String subscriberName;
    private String[] subscriberContactInfo;  
    private String subcriberLocation;
    private String[] subcribedFoodCategories;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String[] getSubscriberContactInfo() {
        return subscriberContactInfo;
    }

    public void setSubscriberContactInfo(String[] subscriberContactInfo) {
        this.subscriberContactInfo = subscriberContactInfo;
    }

    public String getSubcriberLocation() {
        return subcriberLocation;
    }

    public void setSubcriberLocation(String subcriberLocation) {
        this.subcriberLocation = subcriberLocation;
    }

    public String[] getSubcribedFoodCategories() {
        return subcribedFoodCategories;
    }

    public void setSubcribedFoodCategories(String[] subcribedFoodCategories) {
        this.subcribedFoodCategories = subcribedFoodCategories;
    }
    
    
}

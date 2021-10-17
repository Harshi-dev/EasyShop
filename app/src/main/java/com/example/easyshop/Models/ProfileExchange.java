package com.example.easyshop.Models;

public class ProfileExchange {


    String productName, OwnerName;
    int image;

    public ProfileExchange(String productName, String ownerName, int image) {
        this.productName = productName;
        OwnerName = ownerName;
        this.image = image;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {

        return image;
    }

    public String getName() {

        return OwnerName;
    }

    public String getProductName(){

        return productName;
    }
}

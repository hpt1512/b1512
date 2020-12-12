package com.example.thecoffeehouse;

public class orderItem {
    String title337,price337;
    Integer image337;

    public orderItem(String title, String price, Integer image) {
        this.title337 = title;
        this.price337 = price;
        this.image337 = image;
    }

    public String getTitle() {
        return title337;
    }

    public void setTitle(String title) {
        this.title337 = title;
    }

    public String getPrice() {
        return price337;
    }

    public void setPrice(String price) {
        this.price337 = price;
    }

    public Integer getImage() {
        return image337;
    }

    public void setImage(Integer image) {
        this.image337 = image;
    }
}

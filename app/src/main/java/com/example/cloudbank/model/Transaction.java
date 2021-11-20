package com.example.cloudbank.model;

public class Transaction {
    private String imageName;
    private String Date;
    private String Title;
    private String Cost;

    public Transaction(String imageName, String date, String title, String cost) {
        this.imageName = imageName;
        this.Date = date;
        this.Title = title;
        this.Cost = cost+" dh";
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Transaction "+this.Title  ;
    }
}

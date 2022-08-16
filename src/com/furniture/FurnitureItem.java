package com.furniture;

public class FurnitureItem {
    static final int discount = 5;
    private String color;
    private String furnitureUsage;
    private String furnitureType;
    private int furnitureCode;
    private int gradeOfFurniture;
    private float price;

    public FurnitureItem() {

    }

    float calculateDiscount() {
        if (furnitureUsage.equals("Outdoor") && gradeOfFurniture == 1) {
            return (price * FurnitureItem.discount) / 100;
        } else {
            return price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public int getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(int gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

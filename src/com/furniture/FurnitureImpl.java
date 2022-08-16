package com.furniture;

import java.util.Scanner;

public class FurnitureImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setColor("Red");
        furnitureItem.setFurnitureType("Table");
        furnitureItem.setFurnitureCode(101);
        furnitureItem.setGradeOfFurniture(1);
        furnitureItem.setFurnitureUsage("Outdoor");
        furnitureItem.setPrice(10);
        System.out.println("Discounted price is " + " = $" + (furnitureItem.getPrice() - furnitureItem.calculateDiscount()));
    }
}


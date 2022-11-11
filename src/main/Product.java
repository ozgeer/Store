package main;

import entity.Category;
import entity.Brand;

public class Product {
    Brand brand;
    Category category;
    String name;
    String color;
    int productId;
    int price;
    int saleRadio;
    int stockAmount;
    boolean isActive;

    public Product(String name, int productId, Brand brand,Category category,String color, int price, int saleRadio, int stockAmount,boolean isActive){
        this.name=name;
        this.productId=productId;
        this.brand=brand;
        this.category=category;
        this.color=color;
        this.price=price;
        this.saleRadio=saleRadio;
        this.stockAmount=stockAmount;
    }

    public String toString(){
        return "\nName of main.Product:"+getName()+" "+"Brand:"+getBrand()+"Category:"+getCategory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

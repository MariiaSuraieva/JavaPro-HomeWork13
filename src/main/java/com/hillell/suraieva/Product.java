package com.hillell.suraieva;

import java.time.LocalDateTime;
import java.util.Date;

public class Product {
    String type;
    float price;
    boolean isSale;
    Date data;

    public static final float koefSkidki = 0.9F;

    public Product(String type, float price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, float price, boolean isSale) {
        this.type = type;
        this.price = price;
        this.isSale = isSale;
    }

    public Product(String type, float price, boolean isSale, Date data) {
        this.type = type;
        this.price = price;
        this.isSale = isSale;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isSale=" + isSale +
                ", data=" + data +
                '}' + "\n";
    }
}

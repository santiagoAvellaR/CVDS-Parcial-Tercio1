package edu.eci.cvds.parcial.primerTercio.StockManager.Model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}

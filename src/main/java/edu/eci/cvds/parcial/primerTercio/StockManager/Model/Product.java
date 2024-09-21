package edu.eci.cvds.parcial.primerTercio.StockManager.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

}

package edu.eci.cvds.parcial.primerTercio.StockManager.Services;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;

public interface StockServiceInterface {
    Product addProduct(Product product);
    Product updateProduct(String productName, int productQuantity);
}

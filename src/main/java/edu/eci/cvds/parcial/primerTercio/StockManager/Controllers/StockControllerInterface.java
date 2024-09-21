package edu.eci.cvds.parcial.primerTercio.StockManager.Controllers;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;

public interface StockControllerInterface {
    Product addProduct(Product product);
    Product updateProduct(String productName, int productQuantity);
}

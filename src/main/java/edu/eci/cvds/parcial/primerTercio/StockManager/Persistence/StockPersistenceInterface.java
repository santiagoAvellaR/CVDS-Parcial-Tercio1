package edu.eci.cvds.parcial.primerTercio.StockManager.Persistence;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;

public interface StockPersistenceInterface {
    Product addProduct(Product product);
    Product updateProduct(String id, int quantity);

    void cleanStock();

}

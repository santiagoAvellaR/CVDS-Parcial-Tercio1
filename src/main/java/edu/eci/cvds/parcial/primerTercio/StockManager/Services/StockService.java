package edu.eci.cvds.parcial.primerTercio.StockManager.Services;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;
import edu.eci.cvds.parcial.primerTercio.StockManager.Persistence.StockPersistenceInterface;
import org.springframework.stereotype.Service;

@Service
public class StockService implements StockServiceInterface {
    private final StockPersistenceInterface stockPersistence;

    public StockService(StockPersistenceInterface stockPersistence) {
        this.stockPersistence = stockPersistence;
    }
    @Override
    public Product addProduct(Product product){
        return stockPersistence.addProduct(product);
    }

    @Override
    public Product updateProduct(String productName, int productQuantity){
        return stockPersistence.updateProduct(productName, productQuantity);
    }
}

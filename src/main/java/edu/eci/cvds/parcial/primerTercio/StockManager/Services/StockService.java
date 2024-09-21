package edu.eci.cvds.parcial.primerTercio.StockManager.Services;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;
import edu.eci.cvds.parcial.primerTercio.StockManager.Persistence.StockPersistenceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService implements StockServiceInterface {
    private final StockPersistenceInterface stockPersistence;

    @Override
    public Product addProduct(Product product){
        return stockPersistence.addProduct(product);
    }

    @Override
    public Product updateProduct(String productName, int productQuantity){
        return stockPersistence.updateProduct(productName, productQuantity);
    }
}

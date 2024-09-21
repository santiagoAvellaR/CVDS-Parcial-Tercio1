package edu.eci.cvds.parcial.primerTercio.StockManager.PersistenceTest;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.AgentInerface;
import edu.eci.cvds.parcial.primerTercio.StockManager.Model.AlertAgent;
import edu.eci.cvds.parcial.primerTercio.StockManager.Model.LogAgent;
import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;
import edu.eci.cvds.parcial.primerTercio.StockManager.Persistence.StockPersistenceImpl;
import edu.eci.cvds.parcial.primerTercio.StockManager.Persistence.StockPersistenceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StockPersistenceTest {
    private StockPersistenceInterface stockPersistence;
    public StockPersistenceTest(){
        AgentInerface logAgent = new LogAgent();
        AgentInerface alertAgent = new AlertAgent();
        stockPersistence = new StockPersistenceImpl(logAgent,alertAgent);
    }

    @BeforeEach
    void setUp(){
        stockPersistence.cleanStock();
    }
    @Test
    void ShouldAddANewProduct(){
        Product product = new Product("ps5", 5, 10, "Video Juegos");
        assertEquals(stockPersistence.addProduct(product), product);
    }

    @Test
    void ShouldNotCreateAnExistentProduct(){
        Product product1 = new Product("ps5", 5, 10, "Video Juegos");
        Product product2 = new Product("ps5", 5, 10, "Video Juegos");
        stockPersistence.addProduct(product1);
        assertNull(stockPersistence.addProduct(product2));
    }

    @Test
    void ShouldUpdateAnExistentProduct(){
        Product product = new Product("ps5", 5, 10, "Video Juegos");
        stockPersistence.addProduct(product);
        int newQuantity = 3;
        product.setQuantity(newQuantity);
        stockPersistence.updateProduct(product.getName(), newQuantity);
    }

    @Test
    void ShouldNotUpdateANotExistentProduct(){
        Product product = new Product("ps5", 5, 10, "Video Juegos");
        assertNull(stockPersistence.updateProduct(product.getName(), product.getQuantity()));
    }

}

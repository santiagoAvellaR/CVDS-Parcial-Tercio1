package edu.eci.cvds.parcial.primerTercio.StockManager.Model;

import org.springframework.stereotype.Component;

@Component
public class LogAgent implements AgentInerface{
    @Override
    public void updateProduct(String productName, int productQuantity) {
        System.out.printf("Producto %s -> %d unidades disponibles\n",  productName, productQuantity) ;
    }
}

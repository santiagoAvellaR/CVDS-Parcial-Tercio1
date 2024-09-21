package edu.eci.cvds.parcial.primerTercio.StockManager.Model;

import org.springframework.stereotype.Component;

@Component
public class AlertAgent implements AgentInerface{
    @Override
    public void updateProduct(String productName, int productQuantity) {
        if (productQuantity < 5){
            System.out.printf("ALERTA!!! El stock del Producto: %s es muy bajo, sólo quedan %d unidades\n", productName, productQuantity);
        }
    }
}

package edu.eci.cvds.parcial.primerTercio.StockManager.Model;

public interface AgentInerface {
    /*
    This class receives notifications from NotifierAgentInterface objects
     */
    void updateProduct(String productName, int productQuantity);
}

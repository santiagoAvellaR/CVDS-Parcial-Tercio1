package edu.eci.cvds.parcial.primerTercio.StockManager.Persistence;

public interface NotifierAgentInterface {
    void notifyAgentsOfAProductUpdate(String productName, int productQuantity);
}

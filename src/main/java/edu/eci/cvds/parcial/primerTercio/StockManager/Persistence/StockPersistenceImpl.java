package edu.eci.cvds.parcial.primerTercio.StockManager.Persistence;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.AgentInerface;
import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class StockPersistenceImpl implements StockPersistenceInterface, NotifierAgentInterface{
    private HashMap<String, Product> stock = new HashMap<>();
    private List<AgentInerface> agents;

    public StockPersistenceImpl(@Qualifier("logAgent") AgentInerface logAgent, @Qualifier("alertAgent") AgentInerface alertAgent){
        agents.add(logAgent);
        agents.add(alertAgent);
    }

    @Override
    public void notifyAgentsOfAProductUpdate(String productName, int productQuantity){
        for (AgentInerface agent : agents){
            agent.updateProduct(productName, productQuantity);
        }
    }

    @Override
    public Product addProduct(Product product) {
        if (stock.containsKey(product.getName())){
            return null;
        }
        stock.put(product.getName(), product);
        return product;
    }

    @Override
    public Product updateProduct(String name, int quantity) {
        if (!stock.containsKey(name)){
            return null;
        }
        Product product = stock.get(name);
        product.setQuantity(quantity);
        stock.put(name, product);
        notifyAgentsOfAProductUpdate(name, quantity);
        return product;
    }
}


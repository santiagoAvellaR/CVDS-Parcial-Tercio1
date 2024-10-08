package edu.eci.cvds.parcial.primerTercio.StockManager.Controllers;

import edu.eci.cvds.parcial.primerTercio.StockManager.Model.Product;
import edu.eci.cvds.parcial.primerTercio.StockManager.Services.StockServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/StockManager")
@RequiredArgsConstructor
public class StockController implements StockControllerInterface{
    private final StockServiceInterface stockService;


    @Override
    @PostMapping("/createdProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return stockService.addProduct(product);
    }

    @Override
    @PutMapping("/updatedProduct")
    public Product updateProduct(@RequestParam String productName, @RequestParam int productQuantity) {
        return stockService.updateProduct(productName, productQuantity);
    }
}

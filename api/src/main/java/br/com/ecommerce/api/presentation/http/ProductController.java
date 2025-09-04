package br.com.ecommerce.api.presentation.http;

import br.com.ecommerce.api.application.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.ecommerce.api.domain.entities.Product;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getCatalogProducts() {
        return this.productService.getCatalogProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        this.productService.addProduct(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        this.productService.updateProduct(product);
    }

    @PatchMapping
    public void deleteProduct(Long id) {
        this.productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public Product findProductDetailsBySKU(@PathVariable Long id) {
        return this.productService.findProductDetailsById(id);
    }
}

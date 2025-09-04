package br.com.ecommerce.api.application.services;

import br.com.ecommerce.api.domain.entities.Product;
import br.com.ecommerce.api.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getCatalogProducts() {
        return this.productRepository.findAll();
    }

    public void addProduct(Product product) {
        this.productRepository.save(product);
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Long id) {
        this.productRepository.deleteById(id);
    }

    public Product findProductDetailsById(Long id) {
        return new Product();
    }
}

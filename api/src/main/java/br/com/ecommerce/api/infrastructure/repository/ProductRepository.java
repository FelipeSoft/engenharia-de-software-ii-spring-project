package br.com.ecommerce.api.infrastructure.repository;

import br.com.ecommerce.api.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }

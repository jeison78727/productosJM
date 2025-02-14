package com.axity.test.product.repository;

import com.axity.test.product.repository.datamodel.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}

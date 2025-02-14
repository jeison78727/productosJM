package com.axity.test.product.repository;

import com.axity.test.product.repository.datamodel.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}

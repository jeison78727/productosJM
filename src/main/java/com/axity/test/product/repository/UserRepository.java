package com.axity.test.product.repository;

import com.axity.test.product.repository.datamodel.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}

package com.valmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valmart.entity.Product;

@Repository
public interface ValmartRepository extends JpaRepository<Product, Long> {

}

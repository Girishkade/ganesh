package com.farma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farma.model.Product;

public interface FarmaRepository extends JpaRepository<Product, Integer> {

	Product deleteById(Product id);

}

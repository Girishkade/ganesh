package com.farma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farma.model.Product;

@Repository
public interface FarmaRepository extends JpaRepository<Product, Integer> {

}

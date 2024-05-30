package com.spring5.demo.repository;

import com.spring5.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}

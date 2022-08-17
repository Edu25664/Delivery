package com.Edu25664.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Edu25664.vendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

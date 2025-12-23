package com.servidormagnatas.gnomomuitoloco.repositories;

import com.servidormagnatas.gnomomuitoloco.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

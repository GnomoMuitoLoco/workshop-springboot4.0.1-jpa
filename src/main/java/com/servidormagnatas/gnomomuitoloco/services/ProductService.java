package com.servidormagnatas.gnomomuitoloco.services;

import com.servidormagnatas.gnomomuitoloco.entities.Product;
import com.servidormagnatas.gnomomuitoloco.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository respository;

    public List<Product> findAll() {
        return respository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = respository.findById(id);
        return obj.get();
    }
}

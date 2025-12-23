package com.servidormagnatas.gnomomuitoloco.services;

import com.servidormagnatas.gnomomuitoloco.entities.Category;
import com.servidormagnatas.gnomomuitoloco.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository respository;

    public List<Category> findAll() {
        return respository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = respository.findById(id);
        return obj.get();
    }
}

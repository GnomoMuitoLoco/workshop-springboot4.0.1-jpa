package com.servidormagnatas.gnomomuitoloco.repositories;

import com.servidormagnatas.gnomomuitoloco.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

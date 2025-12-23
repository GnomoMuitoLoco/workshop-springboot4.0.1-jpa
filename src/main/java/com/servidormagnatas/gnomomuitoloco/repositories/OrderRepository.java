package com.servidormagnatas.gnomomuitoloco.repositories;

import com.servidormagnatas.gnomomuitoloco.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

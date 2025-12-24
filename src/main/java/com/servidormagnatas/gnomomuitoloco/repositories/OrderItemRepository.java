package com.servidormagnatas.gnomomuitoloco.repositories;

import com.servidormagnatas.gnomomuitoloco.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

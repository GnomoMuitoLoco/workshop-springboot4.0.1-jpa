package com.servidormagnatas.gnomomuitoloco.config;

import com.servidormagnatas.gnomomuitoloco.entities.Order;
import com.servidormagnatas.gnomomuitoloco.entities.User;
import com.servidormagnatas.gnomomuitoloco.repositories.OrderRepository;
import com.servidormagnatas.gnomomuitoloco.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "admin", "gnomomuitoloco@hotmail.com", "admin123");

        Order o1 = new Order(null, Instant.parse("2025-12-23T02:51:07Z"), u1);

        userRepository.saveAll(Arrays.asList(u1));
        orderRepository.saveAll(Arrays.asList(o1));
    }
}

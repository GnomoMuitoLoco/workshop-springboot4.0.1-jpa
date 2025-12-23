package com.servidormagnatas.gnomomuitoloco.config;

import com.servidormagnatas.gnomomuitoloco.entities.Category;
import com.servidormagnatas.gnomomuitoloco.entities.Order;
import com.servidormagnatas.gnomomuitoloco.entities.Product;
import com.servidormagnatas.gnomomuitoloco.entities.User;
import com.servidormagnatas.gnomomuitoloco.entities.enums.OrderStatus;
import com.servidormagnatas.gnomomuitoloco.repositories.CategoryRepository;
import com.servidormagnatas.gnomomuitoloco.repositories.OrderRepository;
import com.servidormagnatas.gnomomuitoloco.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Vips");
        Category cat2 = new Category(null, "MGT-Cash");

        Product p1 = new Product(null, "Servidor Magnatas", "Servidor de Minecraft PvP Factions.", 29.99, "");
        Product p2 = new Product(null, "MGT-Cash", "Sistema de economia in-game.", 9.99, "");
        Product p3 = new Product(null, "VIP", "Pacote VIP com vantagens exclusivas.", 14.99, "");

        p1.getCategories().add(cat1);
        p2.getCategories().add(cat2);
        p3.getCategories().add(cat1);

        categoryRepository.saveAll(Arrays.asList(cat1, cat2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        User u1 = new User(null, "admin", "gnomomuitoloco@hotmail.com", "admin123");
        User u2 = new User(null, "Fatima", "fatima@hotmail.com", "fatima123");
        User u3 = new User(null, "Joao", "joao@hotmail.com", "joao123");

        Order o1 = new Order(null, Instant.parse("2025-12-23T02:51:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-12-24T03:51:07Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2025-12-25T04:51:07Z"), OrderStatus.CANCELED, u1);
        Order o4 = new Order(null, Instant.parse("2025-12-26T05:51:07Z"), OrderStatus.DELIVERED, u3);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));


    }
}

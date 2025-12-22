package com.servidormagnatas.gnomomuitoloco.Config;

import com.servidormagnatas.gnomomuitoloco.entities.User;
import com.servidormagnatas.gnomomuitoloco.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "admin", "gnomomuitoloco@hotmail.com", "admin123");

        userRepository.saveAll(Arrays.asList(u1));
    }
}

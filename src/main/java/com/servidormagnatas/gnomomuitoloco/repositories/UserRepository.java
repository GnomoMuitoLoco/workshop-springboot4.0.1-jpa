package com.servidormagnatas.gnomomuitoloco.repositories;

import com.servidormagnatas.gnomomuitoloco.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

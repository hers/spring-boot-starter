package com.hers.spring.boot.starter.repository;

import com.hers.spring.boot.starter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

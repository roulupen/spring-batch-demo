package com.opensystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensystem.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.example.Credit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Credit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}


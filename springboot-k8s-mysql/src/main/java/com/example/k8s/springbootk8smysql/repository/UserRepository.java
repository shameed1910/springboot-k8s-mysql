package com.example.k8s.springbootk8smysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.k8s.springbootk8smysql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

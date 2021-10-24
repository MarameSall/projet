package com.niit.niitspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.niitspringproject.model.Client;

public interface UserRepository extends JpaRepository<Client, Integer> {

}

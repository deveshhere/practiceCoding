package com.firstcode.practicecoding.repositories;

import com.firstcode.practicecoding.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Customer, Long> {}

package com.firstcode.practicecoding.Repositories;

import com.firstcode.practicecoding.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Customer, Long> {}

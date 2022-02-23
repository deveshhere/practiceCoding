package com.firstcode.practicecoding.repositories;

import com.firstcode.practicecoding.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {}

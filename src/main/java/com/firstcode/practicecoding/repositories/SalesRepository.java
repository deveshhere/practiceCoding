package com.firstcode.practicecoding.repositories;

import com.firstcode.practicecoding.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SalesRepository extends JpaRepository<Sales, Long> {}

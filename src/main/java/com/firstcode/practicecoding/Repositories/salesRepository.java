package com.firstcode.practicecoding.Repositories;

import com.firstcode.practicecoding.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salesRepository extends JpaRepository<Sales, Long> {}

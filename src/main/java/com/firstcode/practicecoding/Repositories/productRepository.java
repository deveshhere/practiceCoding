package com.firstcode.practicecoding.Repositories;

import com.firstcode.practicecoding.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<Products, Long> {}

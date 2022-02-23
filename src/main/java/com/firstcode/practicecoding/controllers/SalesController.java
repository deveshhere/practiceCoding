package com.firstcode.practicecoding.controllers;

import com.firstcode.practicecoding.entities.Sales;
import com.firstcode.practicecoding.repositories.SalesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

  @Autowired SalesRepository salesRepo;

  @GetMapping("/sales")
  public String salesdetails() {
    return "Total";
  }

  @GetMapping("/totalSales")
  public List<Sales> addproduct() {
    return salesRepo.findAll();
  }

  @PutMapping("/updateSales")
  public String updateSales(@RequestBody Sales sales) {
    salesRepo.save(sales);
    return "updated";
  }
}

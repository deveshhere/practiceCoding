package com.firstcode.practicecoding.controllers;

import com.firstcode.practicecoding.Repositories.productRepository;
import com.firstcode.practicecoding.entities.products;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

  @Autowired private productRepository productRepo;

  @GetMapping("/Alldata")
  public String productsDetails() {
    return "names";
  }

  @GetMapping("/addProduct")
  public List<products> addproduct() {
    return productRepo.findAll();
  }

  @PutMapping("/updateProduct")
  public String Updateproduct(@RequestBody products product) {
    productRepo.save(product);
    return "updated";
  }
}

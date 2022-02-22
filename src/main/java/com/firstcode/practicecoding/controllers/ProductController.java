package com.firstcode.practicecoding.controllers;
import com.firstcode.practicecoding.Repositories.productRepository;
import com.firstcode.practicecoding.entities.Products;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private productRepository productRepo;

    @GetMapping("/Alldata")
    public String productsDetails(){
        return "names";
    }

    @GetMapping("/addProduct")
    public List<Products> addproduct(){
        return productRepo.findAll();
    }


    @PutMapping("/updateProduct")
    public String Updateproduct(@RequestBody Products product){
        productRepo.save(product);
        return "updated";
    }
}

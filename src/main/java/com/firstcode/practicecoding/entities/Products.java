package com.firstcode.practicecoding.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Products {

  public Products(long id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }
<<<<<<< HEAD:src/main/java/com/firstcode/practicecoding/entities/Products.java
  public Products(){
=======
>>>>>>> 8741040e19688421e8690bc91d482c3336906783:src/main/java/com/firstcode/practicecoding/entities/products.java

  public products() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Id private long id;
  private String name;
  private String city;
}

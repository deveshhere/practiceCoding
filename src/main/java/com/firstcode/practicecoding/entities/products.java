package com.firstcode.practicecoding.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class products {

  public products(long id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }
  public products(){

  }

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

  @Id
  private long id;
  private  String name;
  private  String city;


}

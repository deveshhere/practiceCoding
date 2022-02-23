package com.firstcode.practicecoding.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
// @AllArgsConstructor
// @NoArgsConstructor
public class Sales {
  @Id private Long id;
  private String name;
  private String sale;

  public Sales(Long id, String name, String sale) {
    this.id = id;
    this.name = name;
    this.sale = sale;
  }

  public Sales() {}
}

package com.firstcode.practicecoding;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.firstcode.practicecoding.Repositories.productRepository;
import com.firstcode.practicecoding.controllers.productController;
import com.firstcode.practicecoding.entities.Customer;
import com.firstcode.practicecoding.entities.products;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class productTest {
  @Autowired
  productController productcontroller;

  @Autowired
  private MockMvc mockMvc;

  @Mock
  productRepository productRepo;

  @Test
  void contextLoads() throws Exception {
    assertThat(productcontroller).isNotNull();
  }

  @Test
  void injectedComponentsAreNotNull() {
    assertThat(productRepo).isNotNull();
  }

  @Test
  void testing() {
    String s = productcontroller.productsDetails();
    assertEquals("names", s);
  }

  @Test
  public void getAllData() throws Exception {
    this.mockMvc
        .perform(get("/addProduct"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Mobile")));
  }
  @Test
  void updateTest() {
    products pro = new products(1,"Mobile","Raipur");
    String update = productcontroller.Updateproduct(pro);
    assertEquals("updated",update);

  }


}

package com.firstcode.practicecoding;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.firstcode.practicecoding.controllers.SalesController;
import com.firstcode.practicecoding.entities.Sales;
import com.firstcode.practicecoding.repositories.SalesRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class SalesTest {

  @Autowired SalesController salesController;

  @Autowired private MockMvc mockMvc;

  @Mock SalesRepository salesRepository;

  @Test
  void contextLoads() throws Exception {
    assertThat(salesController).isNotNull();
  }

  @Test
  void injectedComponentsAreNotNull() {
    assertThat(salesRepository).isNotNull();
  }

  @Test
  void testing() {
    String s = salesController.salesdetails();
    assertEquals("Total", s);
  }

  @Test
  public void getAllData() throws Exception {
    this.mockMvc
        .perform(get("/totalSales"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("laptop")));
  }

  @Test
  void updateTest() {
    Sales pro = new Sales(1L, "john", "laptop");
    String update = salesController.updateSales(pro);
    assertEquals("updated", update);
  }
}

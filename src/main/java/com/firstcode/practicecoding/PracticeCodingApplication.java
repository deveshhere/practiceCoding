package com.firstcode.practicecoding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PracticeCodingApplication {

  public static void main(String[] args) {
    log.info("hello world");
    log.info("hello world");
    SpringApplication.run(PracticeCodingApplication.class, args);
  }
}

package io.github.adrianjuhl.simple_springboot_camel_prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A spring-boot application.
 */
@SpringBootApplication
public class Application {

  /**
   * Run the application.
   *
   * @param args the command line arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }

}

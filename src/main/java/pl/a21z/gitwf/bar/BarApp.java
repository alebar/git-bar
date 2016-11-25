package pl.a21z.gitwf.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarApp {
  public static void main(String[] args) {
    new SpringApplication(BarApp.class).run(args);
  }
}

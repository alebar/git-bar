package pl.a21z.gitwf.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.a21z.gitwf.core.HelloWorldGenerator;

@SpringBootApplication
public class BarApp {
  public static void main(String[] args) {
    System.out.println(new HelloWorldGenerator().generate());
    new SpringApplication(BarApp.class).run(args);
  }
}

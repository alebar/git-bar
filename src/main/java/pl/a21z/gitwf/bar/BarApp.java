package pl.a21z.gitwf.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.a21z.gitwf.core.HelloWorldGenerator;

@SpringBootApplication
public class BarApp {
  public static void main(String[] args) {
  	HelloWorldGenerator g = new HelloWorldGenerator();
    System.out.println(g.generate());
    new SpringApplication(BarApp.class).run(args);
  }
}

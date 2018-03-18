package be.enyed.zkboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ZkBootDemo {
  
  public static void main(String[] args) throws Exception {
    SpringApplication.run(ZkBootDemo.class, args);
  }
  
}

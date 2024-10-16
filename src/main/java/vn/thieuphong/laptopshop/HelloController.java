package vn.thieuphong.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/")
  public String sayHello() {
    return "Hello World with Thieu Phong";}
}
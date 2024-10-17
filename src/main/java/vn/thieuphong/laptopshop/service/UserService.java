package vn.thieuphong.laptopshop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {
  @GetMapping("")
  public String handleHello() {
    return "Hello from user service";
  }
}

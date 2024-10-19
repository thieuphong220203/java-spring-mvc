package vn.thieuphong.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.thieuphong.laptopshop.domain.User;
import vn.thieuphong.laptopshop.service.UserService;
@Controller
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage(Model model) {
    // List<User> arrUsers = this.userService.getAllUsers();
    List<User> arrUsers = this.userService.getAllUsersByEmail("tangthieuphong888@gmail.com");
    System.out.println(arrUsers);
    model.addAttribute("data", "test");
    model.addAttribute("data1", "From controller");

    return "hello";
  }

  @RequestMapping("/admin/user") //GET
  public String getUserPage(Model model) {
    model.addAttribute("newUser", new User());
    return "admin/user/create";
  }

  @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
  public String createUser(Model model, @ModelAttribute("newUser") User newUser) {
    // System.out.println(newUser);
    User user = this.userService.handleSaveUser(newUser);
    System.out.println(user);
    return "hello";
  }
}

// @RestController
// public class UserController {
//   UserService userService;

//   public UserController(UserService userService) {
//     this.userService = userService;
//   }

//   @GetMapping("/")
//   public String getHomePage() {
//     return this.userService.handleHello();
//   }
// }

package vn.thieuphong.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    List<User> users = this.userService.getAllUsers();
    // System.out.println(">>> check users: " + users);
    model.addAttribute("users", users);
    return "admin/user/table-user";
  }
  
  @RequestMapping("/admin/user/create") //GET
  public String createUserPage(Model model) {
    model.addAttribute("newUser", new User());
    return "admin/user/create";
  }

  @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
  public String createUser(Model model, @ModelAttribute("newUser") User newUser) {
    // System.out.println(newUser);
    User user = this.userService.handleSaveUser(newUser);
    System.out.println(user);
    return "redirect:/admin/user";
  }

  @RequestMapping("/admin/user/{id}") //GET
  public String getUserDetailPage(@PathVariable("id") long id, Model model) {
    System.out.print("check path id = " + id);
    User user = this.userService.getUserById(id);
    model.addAttribute("user", user);
    model.addAttribute("id", id);
    return "/admin/user/show";
  }

  @RequestMapping("/admin/user/update") //GET
  public String updateUserPage(@RequestParam("id") long id, Model model) {
    User user = this.userService.getUserById(id);
    model.addAttribute("newUser", user);
    return "admin/user/update";
  }
  
  @PostMapping("/admin/user/update") 
  public String postUpdateUser(@ModelAttribute("newUser") User user) {
    User currentUser = this.userService.getUserById(user.getId());
    if (currentUser != null) {
      System.out.println("run here");
      currentUser.setFullName(user.getFullName());
      currentUser.setPassword(user.getPassword());
      currentUser.setPhone(user.getPhone());
      currentUser.setAddress(user.getAddress());
      this.userService.handleSaveUser(currentUser);
    }
    return "redirect:/admin/user";
  }

  @RequestMapping("/admin/user/delete/{id}") //GET
  public String deleteUserPage(@PathVariable("id") long id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("newUser", new User());

    return "/admin/user/delete";
  }
  
  @PostMapping("/admin/user/delete") 
  public String postDeleteUser(@ModelAttribute("newUser") User user) {
    this.userService.deleteUserById(user.getId());
    return "redirect:/admin/user";
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

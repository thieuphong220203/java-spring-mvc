package vn.thieuphong.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.thieuphong.laptopshop.domain.User;
import vn.thieuphong.laptopshop.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return this.userRepository.findAll();
  }

  public List<User> getAllUsersByEmail(String email) {
    return this.userRepository.findByEmail(email);
  }

  public User handleSaveUser(User user) {
    return this.userRepository.save(user);
  }

  public User getUserById(long id) {
    return this.userRepository.findById(id);
  }

  public void deleteUserById(long id) {
    this.userRepository.deleteById(id);
  }
}

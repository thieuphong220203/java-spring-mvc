package vn.thieuphong.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.thieuphong.laptopshop.domain.User;


//crud: create, read, update, delete
@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
  @Override
  User save(@SuppressWarnings("null") User user);
  List<User> findByEmail(String email);
}

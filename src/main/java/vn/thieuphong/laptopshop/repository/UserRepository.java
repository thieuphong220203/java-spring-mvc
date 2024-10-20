package vn.thieuphong.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.thieuphong.laptopshop.domain.User;


//crud: create, read, update, delete
@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
  @SuppressWarnings({ "null", "unchecked" })
  @Override
  User save(User user);

  List<User> findByEmail(String email);

  @SuppressWarnings("null")
  @Override
  List<User> findAll();

  @SuppressWarnings("null")
  User findById(long id);

  void deleteById(long id);
}

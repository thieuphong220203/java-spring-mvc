package vn.thieuphong.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.thieuphong.laptopshop.domain.User;

//crud: create, read, update, delete
@Repository
public interface  UserRepository extends CrudRepository<User, Long> {
  @Override
  User save(@SuppressWarnings("null") User user);
}

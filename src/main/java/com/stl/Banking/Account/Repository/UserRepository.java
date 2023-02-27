package com.stl.Banking.Account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Banking.Account.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

 User findByUsername(String username);

  //Optional<User> findByUsername(String username);
}


package com.stl.Banking.Account.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Banking.Account.Entity.Account;
import com.stl.Banking.Account.Entity.User;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByUser(Optional<User> user);
}
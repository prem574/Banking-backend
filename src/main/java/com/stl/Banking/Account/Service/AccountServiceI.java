package com.stl.Banking.Account.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stl.Banking.Account.Entity.Account;

public interface AccountServiceI {
	  
	  List<Account> getAllAccounts();
	  
	  ResponseEntity<Account> getAccountById(Long id);
	  
	  Account createAccount(Account account);
	  
	  ResponseEntity<Account> updateAccount(Long id, Account account);
	  
	  void deleteAccount(Long id);
	  List<Account> getAccountsByUserId(Long userId);
	}
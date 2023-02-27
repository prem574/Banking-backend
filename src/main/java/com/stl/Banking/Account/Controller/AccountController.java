package com.stl.Banking.Account.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stl.Banking.Account.Entity.Account;
import com.stl.Banking.Account.Service.AccountServiceImpl;

@RestController
@CrossOrigin("*")
public class AccountController {
  
  @Autowired
  private AccountServiceImpl accountService;
  
  @GetMapping("/accounts")
  public List<Account> getAllAccounts() {
    return accountService.getAllAccounts();
  }
  
  @GetMapping("/accounts/{id}")
  public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
    return accountService.getAccountById(id);
  }
  
  @PostMapping("/accounts")
  public Account createAccount(@RequestBody Account account) {
	  System.out.println(account);
	  account.setDateCreated();
	  account.setLastUpdated();
    return accountService.createAccount(account);
    
  }
  
  @PutMapping("/accounts/{id}")
  public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
    return accountService.updateAccount(id, account);
  }
  
  @DeleteMapping("/accounts/{id}")
  public void deleteAccount(@PathVariable Long id) {
    accountService.deleteAccount(id);
  }
  
  @GetMapping("/users/{userId}/accounts")
  public ResponseEntity<List<Account>> getAccountsByUserId(@PathVariable Long userId) {
      List<Account> accounts = accountService.getAccountsByUserId(userId);
      return new ResponseEntity<>(accounts, HttpStatus.OK);
  }
}
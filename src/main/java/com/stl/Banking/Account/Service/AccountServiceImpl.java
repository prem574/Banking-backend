package com.stl.Banking.Account.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stl.Banking.Account.Entity.Account;
import com.stl.Banking.Account.Entity.User;
import com.stl.Banking.Account.Exception.ResourceNotFoundException;
import com.stl.Banking.Account.Repository.AccountRepository;
import com.stl.Banking.Account.Repository.UserRepository;

@Service
public class AccountServiceImpl implements AccountServiceI {
 @Autowired
  private AccountRepository accountRepository;
  @Autowired
  private UserRepository userRepository;

//  @Autowired
//  public AccountServiceImpl(AccountRepository accountRepository) {
//    this.accountRepository = accountRepository;
//  }
  
  

  @Override
  public List<Account> getAllAccounts() {
    return accountRepository.findAll();
  }

  public ResponseEntity<Account> getAccountById(Long id) {
    Account acc =  accountRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Account not exist with id: "+ id));
	return ResponseEntity.ok(acc);
  }

  public Account createAccount(Account account) {
    return accountRepository.save(account);
  }

  public ResponseEntity<Account> updateAccount(Long id, Account accountDetails) {
  Account account = accountRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Account not exist with id: "+ id));
	

    account.setType(accountDetails.getType());
    account.setBranch(accountDetails.getBranch());
    account.setIfsc(accountDetails.getIfsc());
    account.setBalance(accountDetails.getBalance());
    account.setLastUpdated();

    return ResponseEntity.ok(account);

  }
  @Override
  public List<Account> getAccountsByUserId(Long userId) {
      Optional<User> user = userRepository.findById(userId);
      List<Account> accounts = accountRepository.findByUser(user);
      return accounts;
  }

@Override
public void deleteAccount(Long id) {
	
	
}

}







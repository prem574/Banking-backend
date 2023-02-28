// package com.stl.Banking.Account;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import java.time.LocalDateTime;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.stl.Banking.Account.Entity.Account;
// import com.stl.Banking.Account.Entity.User;
// import com.stl.Banking.Account.Repository.AccountRepository;

// @SpringBootTest
// class DemoApplicationTests {

// 	@Autowired
// 	AccountRepository accountrepo;
	
// 	@Test
// 	public void testCreate() {
// 		User user = new User(1l,"a","d","y","f","e","p","");
// 		Account a = new Account();
// 		a.setId(2l);
// 		a.setBalance((double) 1000);
// 		a.setBranch("gudivada");
// 		a.setIfsc("123456");
// 		a.setType("Saving");
// 		a.setUser(user);
// 		a.setDateCreated();
// 		a.setLastUpdated();
// 		accountrepo.save(a);
// 		assertNotNull(accountrepo.findById(1l).get());
		
// 	}
	
// 	@Test
// 	public void testRead() {
// 		List<Account> list = accountrepo.findAll();
// 		assertThat(list).size().isGreaterThan(0);
// 	}
	
// 	@Test
// 	public void testSingleUser() {
// 		Account account = accountrepo.findById(2l).get();
// 		assertEquals("gudivada",account.getBranch());
// 	}

	
// 	@Test
// 	public void testUpdate() {
// 		Account a = accountrepo.findById(2l).get();
// 		a.setBalance((double) 2000);
// 		accountrepo.save(a);
// 		assertNotEquals("800",accountrepo.findById(2l).get().getBalance());
// 	}
	
// 	@Test
// 	public void testDelete() {
// 		accountrepo.deleteById(2l);
// 		assertThat(accountrepo.existsById(2l)).isFalse();
// 	}
// }

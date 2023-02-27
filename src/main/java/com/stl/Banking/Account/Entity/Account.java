package com.stl.Banking.Account.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "account")
public class Account {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Long id;
  
  @ManyToOne(targetEntity=User.class)
  @JoinColumn(name = "user_id",referencedColumnName="id")
  @NotNull
  //@NotBlank(message = "user id must not be empty")
  private User user;
  
 // @NotBlank(message = "Type must be entered")
  private String type;
  //@NotBlank(message = "Enter the branch name")
  private String branch;
  //@NotBlank(message = "Enter the ifsc code")
  private String ifsc;
  private Double balance;
  private LocalDateTime dateCreated;
  private LocalDateTime lastUpdated;
  
  
public Account(Long id, String type, User user,String branch, String ifsc, Double balance, LocalDateTime dateCreated,
		LocalDateTime lastUpdated) {
	super();
	this.id = id;
	this.user=user;
	this.type = type;
	this.branch = branch;
	this.ifsc = ifsc;
	this.balance = balance;
	this.dateCreated = dateCreated;
	this.lastUpdated = lastUpdated;
}


public Account() {
	super();
	// TODO Auto-generated constructor stub
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getBranch() {
	return branch;
}


public void setBranch(String branch) {
	this.branch = branch;
}


public String getIfsc() {
	return ifsc;
}


public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}


public Double getBalance() {
	return balance;
}


public void setBalance(Double balance) {
	this.balance = balance;
}


public LocalDateTime getDateCreated() {
	return dateCreated;
}


public void setDateCreated() {
	
	this.dateCreated = LocalDateTime.now();
}


public LocalDateTime getLastUpdated() {
	return lastUpdated;
}


public void setLastUpdated() {
	LocalDateTime currentTime = LocalDateTime.now();
	this.lastUpdated = currentTime;
}


@Override
public String toString() {
	return "Account [id=" + id + ", type=" + type +", user "+user+", branch=" + branch + ", ifsc=" + ifsc + ", balance=" + balance
			+ ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + "]";
}


public User getUser() {
	return user;
}


public void setUser(@NotNull User i) {
	this.user = i;
}


public LocalDateTime now() {
	LocalDateTime currentTime = LocalDateTime.now();
	System.out.println("Current Date and Time: " + currentTime);
	return currentTime;

}


//public void setUser(int i) {
//	// TODO Auto-generated method stub
//	
//}
  

  
}


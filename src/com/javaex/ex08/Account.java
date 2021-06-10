package com.javaex.ex08;

public class Account {
	
	// 필드
	private String accountNo;
	private int balance;
	
	
	// 생성자
	public Account() {

	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	// 메소드 - GS
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 메소드 - 일반
	public void deposit(int deposit) {
		this.balance = this.balance + deposit;
	}
	
	public void withdraw(int withdraw) {
		this.balance = this.balance - withdraw;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
	
	
	
	
	
	

}

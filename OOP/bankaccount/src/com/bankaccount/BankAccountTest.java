package com.bankaccount;


public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount jeff = new BankAccount();
		
		System.out.println("## Account stuffs ##");
		
		jeff.createDeposit(100, "checking");
		jeff.createWithdraw(29, "checking");
		
		jeff.createDeposit(75, "saving");
		jeff.createWithdraw(48, "saving");
		
		System.out.println(jeff.getChecking());
		System.out.println(jeff.getSaving());
		System.out.println(BankAccount.getNumOfAccounts());
		
	}
}

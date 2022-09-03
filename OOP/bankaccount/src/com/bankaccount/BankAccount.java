package com.bankaccount;


public class BankAccount {
	
	static int numOfAccounts = 0;
	static double totalFunds = 0.0;
	private double checkingBalance = 0.0;
	private double savingBalance = 0.0;

		
	BankAccount() {
		numOfAccounts +=1;
	}
	
	public static int getNumOfAccounts() {
		return numOfAccounts;
	}
	
//////////////////////////////////////
	public double getChecking() {
		return checkingBalance;
	}
	public void setChecking(double x) {
		checkingBalance = x;
	}
//////////////////////////////////////
	
//////////////////////////////////////
	public double getSaving() {
		return savingBalance;
	}
	public void setSaving(double x) {
		savingBalance = x;
	}
//////////////////////////////////////
	
	public void createDeposit(double amount, String account) {
		if(account.equals("checking")){
			checkingBalance += amount;
		}
		else if(account.equals("saving")) {
			savingBalance += amount;
		}
		else {
			System.out.println("balance type is incorrect");
		}
	}
	
	public void createWithdraw(double amount, String account) {
		if(account.equals("checking") && amount <= checkingBalance) {
			checkingBalance -= amount;
		}
		else if(account.equals("saving") && amount <= savingBalance) {
			savingBalance -= amount;
		}
		else {
			System.out.println("balance type is incorrect / amount is greater than balance");
		}
	}
	
	public void totalFunds() {
		System.out.printf("checking balance: %.2f", checkingBalance);
		System.out.printf("saving balance: %.2f", savingBalance);
	}
	
	
	
}


























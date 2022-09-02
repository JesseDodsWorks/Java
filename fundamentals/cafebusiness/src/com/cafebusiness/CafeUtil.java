package com.cafebusiness;
import java.util.ArrayList;

public class CafeUtil {

	public int getStreakGoal() {
		int sum = 0;
		for(int week = 1; week <= 10; week++) {
			sum+=week;
		}
		return sum;
	}
	
	public double getOrderTotal(double[] prices) {
		double sum =0.0;
		for(int i=0; i<prices.length; i++) {
			sum += prices[i];
		}
		return sum;
	}
	
	public void displayMenu(ArrayList<String>menuItems) {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(menuItems.get(i));
		}
	}

	public void addCustomer(ArrayList<String>customers) {
		System.out.println("Please enter your name:");
		String userName = System.console().readLine();
		System.out.printf("Hello, %s. there is %d in front of you...", userName, customers.size());
		customers.add(userName);
		System.out.println(customers);

	}
	
}

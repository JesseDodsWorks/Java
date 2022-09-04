package com.zookeeper;

public class Gorillas extends Mammals{
	
	public void throwSomething() {
		System.out.println("gorilla has throw something");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("gorilla has eat'n a banana, yum yum");
		energyLevel += 10;
	}

	public void climb() {
		System.out.println("gorilla has climd up the tree");
		energyLevel -= 10;
	}
}

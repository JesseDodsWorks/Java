package com.zookeeper2;

public class Bat extends Mammals {
	
	public Bat() {
		super(300);
	}
	
	
	public void fly() {
		System.out.println("flap flap flap, the bat is flying");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("got one guy");
		energyLevel += 25;
	}

	public void attackTown() {
		System.out.println("# town on fire noises #");
		energyLevel -= 100;
	}
}

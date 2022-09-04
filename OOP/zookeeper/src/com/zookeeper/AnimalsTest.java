package com.zookeeper;

public class AnimalsTest {
	public static void main(String[] args) {
		
		Gorillas greg = new Gorillas();
				
		System.out.println("## Mammal Stuffs ##");
		
		greg.throwSomething();
		greg.throwSomething();
		greg.throwSomething();
		
		greg.eatBananas();
		greg.eatBananas();
		
		greg.climb();
		
		System.out.println(greg.displayEnergy());

	}
}

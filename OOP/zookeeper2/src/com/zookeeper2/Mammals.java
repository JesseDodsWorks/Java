package com.zookeeper2;

public class Mammals {
	protected int energyLevel;
	
	public int displayEnergy() {
		return energyLevel;
	}
	
	Mammals(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
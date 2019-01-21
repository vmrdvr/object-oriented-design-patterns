package com.ravi.dpattern.decorator;

public abstract class Pizza {

	String DESCRIPTION = "Unknown";

	public String getDescription() {
		return DESCRIPTION;
	}

	public abstract int getCost();
}

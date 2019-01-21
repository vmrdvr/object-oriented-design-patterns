package com.ravi.dpattern.decorator;

public class PBuffaloChickenPizza extends Pizza {

	public PBuffaloChickenPizza() {
		DESCRIPTION = "BUFFALO CHICKEN";
	}

	public int getCost() {
		return 150;
	}
}

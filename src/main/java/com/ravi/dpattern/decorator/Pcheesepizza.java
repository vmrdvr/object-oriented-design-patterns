package com.ravi.dpattern.decorator;

public class Pcheesepizza extends Pizza {

	public Pcheesepizza() {
		DESCRIPTION = "CHEESE PIZZA";
	}

	public int getCost() {
		return 100;
	}
}

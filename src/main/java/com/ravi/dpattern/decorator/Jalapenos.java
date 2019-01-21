package com.ravi.dpattern.decorator;

public class Jalapenos extends ToppingDecorator {
	Pizza p;

	public Jalapenos(Pizza p) {
		this.p = p;
	}

	@Override
	public int getCost() {

		return p.getCost() + 20;
	}

	public String getDescription() {
		return p.getDescription() + " +jalapenos";
	}

}

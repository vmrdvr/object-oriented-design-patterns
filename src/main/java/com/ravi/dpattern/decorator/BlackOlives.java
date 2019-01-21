package com.ravi.dpattern.decorator;

public class BlackOlives extends ToppingDecorator {

	Pizza pizza;

	public BlackOlives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 30+pizza.getCost();
	}
	public String getDescription(){
		return pizza.getDescription()+ " +BlackOlives";
	}

}

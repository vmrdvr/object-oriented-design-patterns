package com.ravi.dpattern.decorator;

public class DecoratorDesignPattern {
	public static void main(String[] args) {

		Pizza chick = new PBuffaloChickenPizza();

		chick = new Jalapenos(chick);
		chick = new BlackOlives(chick);

		System.out.println(chick.getDescription() + " with cost of : " + chick.getCost());

	}

}

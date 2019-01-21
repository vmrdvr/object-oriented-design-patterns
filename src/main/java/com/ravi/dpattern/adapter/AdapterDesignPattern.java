package com.ravi.dpattern.adapter;

public class AdapterDesignPattern {
	
	public static void main(String[] args) {
	Bird crow = new Crow();
	Vehicle car = new Car();
	Bird sp = new Sparrow();
	
	crow.fly();
	car.move();
	
	Vehicle adapter = new BirdAdapter(sp);
	
	adapter.move();
}

}

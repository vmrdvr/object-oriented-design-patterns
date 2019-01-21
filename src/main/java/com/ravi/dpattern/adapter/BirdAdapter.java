package com.ravi.dpattern.adapter;

public class BirdAdapter  implements Vehicle{
	
	Bird bird;
	
	public BirdAdapter(Bird b) {
		bird=b;
	}
	public void move() {
		
		bird.fly();
	}

	
	
}

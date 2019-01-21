package com.ravi.dpattern.singleton;

public class SingletonDesignPattern {

	private static final SingletonDesignPattern instance = new SingletonDesignPattern();

	private SingletonDesignPattern() {

	}

	public static SingletonDesignPattern getInstance() {
		return instance;
	}

	public int add(int a, int b) {

		return a + b;
	}

	public void doSomething() {
		System.out.println("Doing Something");
	}

	public boolean isEven(int n) {
		return n % 2 == 0;
	}
}

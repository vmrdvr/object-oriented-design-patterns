package com.ravi.dpattern.singleton;

public class SingletonDriver {

	public static void main(String[] args) {

		int i = SingletonDesignPattern.getInstance().add(1, 2);
		System.out.println("addition : " + i);
		SingletonDesignPattern.getInstance().doSomething();
		SynchSigleton.getInstance();
	}

}

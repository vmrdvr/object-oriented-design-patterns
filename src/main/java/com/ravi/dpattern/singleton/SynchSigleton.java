package com.ravi.dpattern.singleton;

public class SynchSigleton {

	private static SynchSigleton instance;

	private SynchSigleton() {
	}
	synchronized public static SynchSigleton getInstance() {

		
		 if (instance == null) {
			 instance = new SynchSigleton(); 
		 }
		 //or below approach for less overhead for multiple thread access }
		 

		return instance;
	}
	//This approach using synch block after checking instead of synch method
	 public static SynchSigleton getInstance2() {

		if (instance == null) {
			synchronized (SynchSigleton.class) {

				if (instance == null)
					instance = new SynchSigleton();
			}
		}
		return instance;
	}

}

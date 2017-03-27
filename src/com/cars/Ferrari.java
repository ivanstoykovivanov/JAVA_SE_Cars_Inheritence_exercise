package com.cars;

public class Ferrari extends Car {
	private boolean ferrariSpecialService;
	
	public Ferrari(int maxSpeed, String color, int doors,  int maxGears,
			boolean ferrariSpecialService) {
		super(maxSpeed, "Ferrari", color, doors, true, maxGears);
		this.ferrariSpecialService = ferrariSpecialService;
	}

	public void orderSpecialService(){
		this.ferrariSpecialService = true ; 
	}
	
	public void cancelSpecialService(){
		this.ferrariSpecialService = false; 
	}
}

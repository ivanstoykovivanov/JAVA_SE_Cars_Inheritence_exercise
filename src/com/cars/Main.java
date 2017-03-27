package com.cars;

public class Main {
	public static void main(String[] args) {
		
		Car bmw = new Car(200, "BMW", "red", 4, true, 5) ;
		bmw.getDashboardInfo();
		bmw.startEngine();
		bmw.changeGearUP();
		bmw.increaseSpeed(100);
		bmw.increaseSpeed(25);	
		bmw.getDashboardInfo();
		bmw.changeGearUP();
		bmw.decreaseSpeed(25);
		bmw.stop() ; 
		bmw.getDashboardInfo();
		
		Ferrari enzo = new Ferrari(360, "red", 2, 7, false) ; 
		System.out.println("FERRARI STARTS ENGINE !!!!");
		enzo.startEngine();
		enzo.getDashboardInfo();
		enzo.changeGearUP();
		enzo.increaseSpeed(50);
		enzo.increaseSpeed(70);
		enzo.changeGearUP();
		enzo.changeGearUP();
		enzo.getDashboardInfo();
		enzo.increaseSpeed(50);
		enzo.getDashboardInfo();
		enzo.decreaseSpeed(100);
		enzo.stop();
	}	
}

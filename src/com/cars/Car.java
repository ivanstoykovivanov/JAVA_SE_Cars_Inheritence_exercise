package com.cars;

public class Car extends Vehicle {
	
	private String brand ; 
	private String color ; 
	private int doors ; 
	private boolean isManual ;	
	private int currentGear; 
	private int maxGears; 

	public Car(int maxSpeed, String brand, String color,
			int doors, boolean isManual, int maxGears) {
		super(maxSpeed);
		this.brand = brand;
		this.color = color;
		this.doors = doors;
		this.isManual = isManual;
		this.currentGear = 0;
		this.maxGears = maxGears;
	}

	public void changeGearUP(){
		if(this.currentGear < this.maxGears){
			this.currentGear++ ; 
			System.out.println("Gear UP");
			System.out.println("Current Gear : " + this.getCurrentGear() );
		}else {
			System.out.println("Max gear reached");
		}
	};
	
	public void changeGearDOWN(){
		if(currentGear > 0 ){
			this.currentGear-- ; 
			System.out.println("Gear DOWN");
			System.out.println("Current Gear : " + this.getCurrentGear() );
		}else{
			System.out.println("Car has stopped");
		}
	};
	
	public void increaseSpeed(int speed){
		if(this.getCurrentSpeed() + speed <= this.getMaxSpeed() ){
			int newSpeed = this.getCurrentSpeed() + speed;
			this.setCurrentSpeed(newSpeed); 
			System.out.println("Speed increased with " + speed);
			System.out.println("Current speed : " + this.getCurrentSpeed() );
		}else{
			System.out.println("Speed limit of car reached");
		}
	} 
	
	public void decreaseSpeed(int speed){
		changeGearDOWN();
		if(this.currentSpeed - speed > 0  ){
			this.currentSpeed -= speed ; 
			System.out.println("Speed decreased with " + speed);
			System.out.println("Current speed : " + this.getCurrentSpeed() );
		}else{
			System.out.println("Car has stopped");
		}
	}
	
	public void getDashboardInfo(){
		System.out.println("SPEED : " + this.getCurrentSpeed() );
		System.out.println("GEAR : " + this.getCurrentGear() );
	}
	
	@Override
	public void startEngine() {
		System.out.println(this.getBrand() +  " starts engine. ");
		super.startEngine();
	}

	@Override
	public void stopEngine() {
		System.out.println(this.getBrand() +  ": stop engine. ");
		super.stopEngine();
	}

	@Override
	public void stop() {
		System.out.println(this.getBrand() +  " STOPPED. ");
		this.setCurrentGear(0);
		super.stop();
	}
	
	private String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private int getDoors() {
		return doors;
	}

	private void setDoors(int doors) {
		this.doors = doors;
	}

	private boolean isManual() {
		return isManual;
	}

	private void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	private int getCurrentGear() {
		return currentGear;
	}

	private void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	private int getMaxGears() {
		return maxGears;
	}

	private void setMaxGears(int maxGears) {
		this.maxGears = maxGears;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	protected int getCurrentSpeed() {
		return currentSpeed;
	}

	protected void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}	
}

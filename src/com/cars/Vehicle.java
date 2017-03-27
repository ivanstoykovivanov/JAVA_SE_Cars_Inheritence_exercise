package com.cars;

public class Vehicle {
	protected int maxSpeed ; 
	protected int currentSpeed ; 
	protected boolean engineWorks ; 
	protected boolean isMoving ; 
	
	public Vehicle(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
		this.engineWorks = false;
		this.isMoving = false;
	}

	public void move(){
		startEngine();
		setIsMoving(true) ; 
	}
	
	protected void startEngine(){
		setEngineWorks(true ); 
	}
	
	public void stopEngine(){
		if(isMoving == false){
			setEngineWorks(false); 
		}else{
			System.out.println("Vehicle is moving. Must stop first");
		}
	}  

	public void stop(){
		setCurrentSpeed(0);
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

	public boolean isEngineWorks() {
		return engineWorks;
	}

	public void setEngineWorks(boolean engineWorks) {
		this.engineWorks = engineWorks;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setIsMoving(boolean isMoving) {
		this.isMoving = isMoving;
	};
}

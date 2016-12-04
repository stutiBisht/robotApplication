package com.xebia.model;

import java.util.ArrayList;

import com.xebia.exceptions.RobotException;
import com.xebia.service.Observer;
import com.xebia.service.Subject;

public class Robot implements Subject{
	
	private double batteryCharged = 100; 
	private boolean displayChestLED = false;
	private boolean headRedLight =false;
	
	// To implement observer design pattern
	ArrayList<Observer> Observers = new ArrayList<Observer>();
	
	
	//Making the private constructor to restrict the creation of instance outside class
	//Below code is to use the sigleton pattern
	private Robot(){}
	
	private static class RobotHelper{
		private static final Robot robotInstance = new Robot();
	}
	
	public static Robot getInstance(){
		return RobotHelper.robotInstance;
	}
	
	//Setter and Getters

	public boolean isDisplayChestLED() {
		return displayChestLED;
	}

	public void setDisplayChestLED(boolean displayChestLED)throws RobotException {
		this.displayChestLED = displayChestLED;
		notifyObservers();
	}
	
	public boolean isHeadRedLight() {
		return headRedLight;
	}

	public void setHeadRedLight(boolean headRedLight) throws RobotException {
		this.headRedLight = headRedLight;
		notifyObservers();
	}

	

	public double getBatteryCharged() {
		return batteryCharged;
	}

	public void setBatteryCharged(double batteryCharged)   {
		this.batteryCharged = batteryCharged;
		
	}

	// To implement observer design pattern
	public void registerObserver(Observer observer) {
		Observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		Observers.remove(observer);
	}

	public void notifyObservers() throws RobotException {
		for(Observer observer : Observers){

			if(this.isDisplayChestLED()==true){
			observer.switchOnChestLedLight();
			}
			
			if(this.isHeadRedLight()==true){
				observer.switchOnHeadRedLight();
			}
			
		}
	}
}

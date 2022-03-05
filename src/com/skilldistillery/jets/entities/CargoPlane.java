package com.skilldistillery.jets.entities;

public class CargoPlane extends Airframe {

	public CargoPlane() {
		super();
	}

	public CargoPlane(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	public void loadCargo() {

		System.out.println("Loading all cargo now!");
		System.out.println("Cargo loaded, taking off now!");
	}
	
//	public void fly() {
	//Double	maxFlyTime = aMaxSpeed / aRange;
	//System.out.println(maxFlyTime);
	//System.out.println("All passengers are buckled up and we are flying!");
//	}

	@Override
	public String toString() {
		return  "Cargo Plane:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: "
				+ getaRange() + " Price: " + getaPrice();
	}

//	@Override
//	public String toString() {
//		return "CargoPlane []";
//	}
}

// create a fly method that prints out the jets details and how long it can fly
// until it runs out of fuel
//using max range / max airspeed mph = 
//fill out and assign the variables
// create the method for cargo plane to do 
//fill up the plane and take off for a humanitarian
// mission

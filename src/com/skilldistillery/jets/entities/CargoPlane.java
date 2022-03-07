package com.skilldistillery.jets.entities;

public class CargoPlane extends Airframe implements CargoCarrier {

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
	// Double maxFlyTime = aMaxSpeed / aRange;
	// System.out.println(maxFlyTime);
	// System.out.println("All passengers are buckled up and we are flying!");
//	}

	@Override
	public String toString() {
		return "Cargo Plane:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: " + getaRange()
				+ " Price: " + getaPrice();
	}

}

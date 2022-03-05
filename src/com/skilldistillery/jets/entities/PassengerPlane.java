package com.skilldistillery.jets.entities;

public class PassengerPlane extends Airframe {
	
	public PassengerPlane() {
		super();
	}

	public PassengerPlane(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	@Override
	public String toString() {
		return "Passenger Plane:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: "
				+ getaRange() + " Price: " + getaPrice();
	}

//	@Override
//	public void fly() {
		// Double maxFlyTime = aMaxSpeed / aRange;
		// System.out.println(maxFlyTime);
//		System.out.println("All passengers are buckled up and we are flying!");
//	}
	// create a fly method that prints out the jets details and how long it can fly
	// until it runs out of fuel
	// using max range / max airspeed mph =
//	}
//variables for the passenger plane
//have passenger plane fill up with people and take off 
}

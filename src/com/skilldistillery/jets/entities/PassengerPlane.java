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

}

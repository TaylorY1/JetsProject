package com.skilldistillery.jets.entities;

public class Spacecraft extends Airframe {

	public Spacecraft() {
		super();
	}

	public Spacecraft(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	@Override
	public String toString() {
		return "Spacecraft:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: "
				+ getaRange() + " Price: " + getaPrice();
	}

//	public void fly() {
	//Double	maxFlyTime =  aMaxSpeed /  aRange;
	//System.out.println(maxFlyTime);
//	System.out.println("3 . . 2 . . 1 . . Blastoff!");
	//}
}

package com.skilldistillery.jets.entities;

public class Hovercraft extends Airframe {

	public Hovercraft() {
		super();
	}

	public Hovercraft(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	@Override
	public String toString() {
		return "Hovercraft:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: " + getaRange()
				+ " Price: " + getaPrice();
	}

}

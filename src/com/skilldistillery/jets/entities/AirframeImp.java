package com.skilldistillery.jets.entities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AirframeImp extends Airframe {

	public AirframeImp() {
		super();
	}

	public AirframeImp(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	@Override
	public String toString() {
		return "Flying Ice Cream Truck:  \n Name:" + getaName() + " MaxSpeed is: " + getaMaxSpeed() + " Range is: "
				+ getaRange() + " Price is: " + getaPrice();
	}

}

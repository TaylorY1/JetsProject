package com.skilldistillery.jets.entities;

public abstract class Airframe {
	private String aType = "";
	private String aName = "";
	private double aMaxSpeed = 0.0;
	private int aRange = 0;
	private long aPrice = 000000;

	public Airframe() {
	}

	public Airframe(String aType, String aName, double aMaxSpeed, int aRange, long aPrice) {
		super();
		this.aType = aType;
		this.aName = aName;
		this.aMaxSpeed = aMaxSpeed;
		this.aRange = aRange;
		this.aPrice = aPrice;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public double getaMaxSpeed() {
		return aMaxSpeed;
	}

	public void setaMaxSpeed(double aMaxSpeed) {
		this.aMaxSpeed = aMaxSpeed;
	}

	public int getaRange() {
		return aRange;
	}

	public void setaRange(int aRange) {
		this.aRange = aRange;
	}

	public long getaPrice() {
		return aPrice;
	}

	public void setaPrice(long aPrice) {
		this.aPrice = aPrice;
	}

	@Override
	public String toString() {
		String output = "Airframe Type= " + aType + ", Airframe Name= " + aName + ", Airframes Max Speed= " + aMaxSpeed
				+ ", Airframes Range= " + aRange + "Airframe Price= " + aPrice;
		return output;
	}

	public void displayAirframe() {
		String ftData = toString();
		System.out.println(ftData);
	}
}

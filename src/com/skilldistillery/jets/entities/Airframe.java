package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Airframe {
	private String aName = "";
	private double aMaxSpeed = 0.0;
	private int aRange = 0;
	private long aPrice = 000000;
	private double maxFlyTime = 0;

	public Airframe() {
		super();
	}

	public Airframe(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super();
		this.aName = aName;
		this.aMaxSpeed = aMaxSpeed;
		this.aRange = aRange;
		this.aPrice = aPrice;
	}

	public double getMaxFlyTime() {
		maxFlyTime = aRange / aMaxSpeed;
		return maxFlyTime;
	}

	public void setMaxFlyTime(double maxFlyTime) {
		this.maxFlyTime = maxFlyTime;
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
		String output = " Airframe Name: " + aName + " Airframe Max Speed: " + aMaxSpeed + " Airframe Range: " + aRange
				+ "Airframe Price: " + aPrice;
		return output;
	}

	public void displayAirframe() {
		String ftData = toString();
		System.out.println(ftData);
	}

	public void fly() {
		System.out.println(toString());
		System.out.println("Takeoff! Max fly time is: " + getMaxFlyTime() + " hours ");
	}

	@Override
	public int hashCode() {
		return Objects.hash(aMaxSpeed, aName, aPrice, aRange, maxFlyTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airframe other = (Airframe) obj;
		return Double.doubleToLongBits(aMaxSpeed) == Double.doubleToLongBits(other.aMaxSpeed)
				&& Objects.equals(aName, other.aName) && aPrice == other.aPrice && aRange == other.aRange
				&& Double.doubleToLongBits(maxFlyTime) == Double.doubleToLongBits(other.maxFlyTime);
	}
}

package com.skilldistillery.jets.entities;

public class FighterJet extends Airframe {

	public FighterJet() {
		super();
	}

	public FighterJet(String aName, double aMaxSpeed, int aRange, long aPrice) {
		super(aName, aMaxSpeed, aRange, aPrice);
	}

	@Override
	public String toString() {
		return "FighterJet:  \n Name:" + getaName() + " Max Speed: " + getaMaxSpeed() + " Max Range: " + getaRange()
				+ " Price: " + getaPrice();
	}

	public void dogFight() {
		System.out.println("You hear the Scramble alarm go off everywhere around you. \n "
				+ "You grab your helmet and your gear and sprint to the plane. \n You climb in "
				+ "the cockpit and fire it up before coming back to the ground to put \n all of "
				+ "your equipment on. Climb back in the jet and wait for chief to give you \n"
				+ " the signal.\n *Highway to the Dangerzone!* starts playing " + "in the background. \n"
				+ " It's go time. . PEW PEW PEW!! Enemy eliminated.   ");

	}
}

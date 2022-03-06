package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirField {
	String fileName = "jets.txt";
	ArrayList<Airframe> jetsonA = new ArrayList<Airframe>();

	public AirField(String fileName) {
		super();
		this.fileName = fileName;
	}

	public AirField() {
		super();
	}

	public AirField(String fileName, AirField aF) {
		super();
		this.fileName = fileName;
	}

	public void readJets() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFields = line.split(",");
				if (jetFields[0].equals("PassengerJet")) {
					PassengerPlane newPP = new PassengerPlane();
					newPP.setaName(jetFields[1]);
					newPP.setaMaxSpeed((Double.parseDouble(jetFields[2])));
					newPP.setaRange((Integer.parseInt(jetFields[3])));
					newPP.setaPrice((Long.parseLong(jetFields[4])));
					jetsonA.add(newPP);
				}
				if (jetFields[0].equals("FighterJet")) {
					FighterJet newFJ = new FighterJet();
					newFJ.setaName(jetFields[1]);
					newFJ.setaMaxSpeed((Double.parseDouble(jetFields[2])));
					newFJ.setaRange((Integer.parseInt(jetFields[3])));
					newFJ.setaPrice((Long.parseLong(jetFields[4])));
					jetsonA.add(newFJ);
				}
				if (jetFields[0].equals("Spacecraft")) {
					Spacecraft newSC = new Spacecraft();
					newSC.setaName(jetFields[1]);
					newSC.setaMaxSpeed((Double.parseDouble(jetFields[2])));
					newSC.setaRange((Integer.parseInt(jetFields[3])));
					newSC.setaPrice((Long.parseLong(jetFields[4])));
					jetsonA.add(newSC);
				}
				if (jetFields[0].equals("Hovercraft")) {
					Hovercraft newHC = new Hovercraft();
					newHC.setaName(jetFields[1]);
					newHC.setaMaxSpeed((Double.parseDouble(jetFields[2])));
					newHC.setaRange((Integer.parseInt(jetFields[3])));
					newHC.setaPrice((Long.parseLong(jetFields[4])));
					jetsonA.add(newHC);
				}
				if (jetFields[0].equals("CargoPlane")) {
					CargoPlane newCP = new CargoPlane();
					newCP.setaName(jetFields[1]);
					newCP.setaMaxSpeed((Double.parseDouble(jetFields[2])));
					newCP.setaRange((Integer.parseInt(jetFields[3])));
					newCP.setaPrice((Long.parseLong(jetFields[4])));
					jetsonA.add(newCP);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void listOutJets() {
		for (Airframe airframe : jetsonA) {
			System.out.println(airframe.toString());
		}

	}

	public void fastestJet() {
		double maxSpeed = 0;
		Airframe fastestJet = null;

		for (Airframe airframe : jetsonA) {

			if (maxSpeed < airframe.getaMaxSpeed()) {
				maxSpeed = airframe.getaMaxSpeed();
				fastestJet = airframe;
			}
		}
		if (fastestJet != null) {
			System.out.println("The fastest airframe in the fleet is " + fastestJet);
		}
	}

	public void longestRange() {
		double maxRange = 0;
		Airframe rangestJet = null;

		for (Airframe airframe : jetsonA) {

			if (maxRange < airframe.getaMaxSpeed()) {
				maxRange = airframe.getaMaxSpeed();
				rangestJet = airframe;
			}
		}
		if (rangestJet != null) {
			System.out.println("The airframe with the longest range is " + rangestJet);
		}
	}

	public void addJet(Scanner sc) {
		String newName;
		double newMaxSpeed;
		int newRange;
		long newPrice;

		System.out.println("Please type in one word as a name: (One word please)");
		newName = sc.next();
		sc.nextLine();
		System.out.println("Please add a max speed in MPH: ");
		newMaxSpeed = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please add a range in miles: ");
		newRange = sc.nextInt();
		sc.nextLine();
		System.out.println("Please add a price: ");
		newPrice = sc.nextLong();
		sc.nextLine();

		AirframeImp newAirframe = new AirframeImp(newName, newMaxSpeed, newRange, newPrice);
		jetsonA.add(newAirframe);

	}

	public void removeJet(Scanner sc) {
		System.out.println("Please pick which jet you would like to remove: ");
		int selection = 1;
		for (int i = 0; i < jetsonA.size(); i++) {
			System.out.println(selection + " " + jetsonA.get(i).getaName());
			selection++;
		}

		int input = sc.nextInt();

		jetsonA.remove(input - 1);
	}

	public void flyAllJets() {
		for (Airframe airframe : jetsonA) {
			airframe.fly();
			airframe.toString();

		}

	}

	public void loadCargo() {
		for (Airframe airframe : jetsonA) {
			if (airframe instanceof CargoPlane) {
				((CargoPlane) airframe).loadCargo();

			}
		}
	}

	public void dogFight() {
		for (Airframe airframe : jetsonA) {
			if (airframe instanceof FighterJet) {
				((FighterJet) airframe).dogFight();
			}
		}
	}
}

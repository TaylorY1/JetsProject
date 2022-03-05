package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.AirframeImp;

public class JetsApplication {

	public static void main(String[] args) {
		AirField airField = new AirField();
		Scanner sc = new Scanner(System.in);
		airField.readJets();

		boolean enterLoop = true;
		while (enterLoop) {
			int choice = 0;
			System.out.println("------------------------------------------------------------------");
			System.out.println("Enter 1 to list fleet ");
			System.out.println("Enter 2 to fly all jets ");
			System.out.println("Enter 3 to view the fastest jet ");
			System.out.println("Enter 4 to view the jet with the longest range ");
			System.out.println("Enter 5 to load all the Cargo jets ");
			System.out.println("Enter 6 to dogfight ");
			System.out.println("Enter 7 to add a jet to the fleet ");
			System.out.println("Enter 8 to remove a jet from the fleet for maintenance repairs");
			System.out.println("Enter 9 to exit the program ");
			System.out.println("------------------------------------------------------------------");
			choice = sc.nextInt();
			if (choice < 10) {
				switch (choice) {
				case 1:
					airField.listOutJets();
					break;
				case 2:
					airField.flyAllJets();
					break;
				case 3:
					airField.fastestJet();
					break;
				case 4:
					airField.longestRange();
					break;
				case 5:
					airField.loadCargo();
					break;
				case 6:
					airField.dogFight();
					break;
				case 7:
					airField.addJet(sc);
					break;
				case 8:
					airField.removeJet(sc);
					break;
				case 9:
					System.out.println("Goodbye!");
					enterLoop = false;
					break;
				default:
					System.out.println("Invalid input -- please try again.");
					break;
				}
			}
		}
		sc.close();
	}
}

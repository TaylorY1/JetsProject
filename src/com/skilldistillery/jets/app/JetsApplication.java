package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		
	int choice = 0;
	System.out.println("------------------------------------------------------------------");
	System.out.println("Enter 1 to list fleet ");
	System.out.println("Enter 2 to fly all jets ");
	System.out.println("Enter 3 to view the fastest jet ");
	System.out.println("Enter 4 to view the jet with the longest range ");
	System.out.println("Enter 5 to load all the Cargo jets ");
	System.out.println("Enter 6 to dogfight the Ruskies ");
	System.out.println("Enter 7 to add a jet to the fleet ");
	System.out.println("Enter 8 to remove a jet from the fleet for maintenance repairs");
	System.out.println("Enter 9 to exit the program ");
	System.out.println("------------------------------------------------------------------");
	choice = sc.nextInt();
	if (choice < 10) {
		
		switch (choice) {
		case 1:
		
		}
	}
		
	sc.close();		
	}

}

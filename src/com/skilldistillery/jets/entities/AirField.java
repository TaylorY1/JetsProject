package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirField {
	String fileName = "jets.txt";
	aF.readJets(fileName)
	AirField aF = new AirField(fileName);
	
	
	public void readJets(String filename) {
		
	try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
		  String line;
		  while ((line = bufIn.readLine()) != null) {
		ArrayList<String> listOfAirframes = new ArrayList<>();
			  System.out.println(listOfAirframes);
			  
		//    System.out.println(line);
		  }
		}
		catch (IOException e) {
		  System.err.println(e);
		}







	}


	public AirField(String fileName, AirField aF) {
		super();
		this.fileName = fileName;
		this.aF = aF;
	}
}



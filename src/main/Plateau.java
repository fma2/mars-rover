package main;

import java.util.ArrayList;
import java.util.List;

// The Plateau object with x and y fields;
public class Plateau {

	private int x;
	private int y;
	private List<List<Integer>> beacons;

	public Plateau (int xCoordinate, int yCoordinate){
		this.x = xCoordinate;
		this.y = yCoordinate;
		this.beacons = new ArrayList<List <Integer>>();
	}
	
	public void setX(int xCoordinate) {
		x = xCoordinate;
	}

	public int getX() {
		return x;
	}
	
	public void setY(int yCoordinate) {
		y = yCoordinate;
	}

	public int getY() {
		return y;
	}
	
	// Converts the string provided by input into an array of integers
	public static int[] convertStringToIntArray(String str) {
		String[] items = str.split(" ");

		int[] results = new int[items.length];
	
		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {};
		}
		return results;
	}
	
	// Checks if rover is out of bounds of the plateau
	public boolean isRoverOutOfBounds(Position roverPosition){
		if (roverPosition.getX() > getX()) {
			return true;
		}
		
		if (roverPosition.getY() > getY()) {
			return true;
		}
		
		if (roverPosition.getX() < 0){
			return true;
		}
		
		if (roverPosition.getY() < 0) {
			return true;
		}
		return false;
	}
	
	public void leaveBeacon(Position position) {
		List<Integer> beacon = new ArrayList<>();
		beacon.add(position.getX());
		beacon.add(position.getY());
		beacons.add(beacon);
	}
	
	public boolean checkIfBeacon(Position position) {		
		for (List<Integer> n : beacons) {
			if (n.get(0) == position.getX() && n.get(1) == position.getY()) return true;
		}
		return false;
	}
}

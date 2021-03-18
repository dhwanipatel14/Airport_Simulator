import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Airport {
	
	private char t;
	private char l;
	private char n;
	private char p;
	private char g;
	private char q;
	Queue<String> takeoutlist ;
	Queue<String> landinglist;
	Queue<String> activities_taken;
	Queue<String> activities_landed;
	private String flightnumber;
	
	public Airport() {
		takeoutlist = new LinkedList();
		takeoutlist = new LinkedList();
		activities_taken = new LinkedList();
		activities_landed = new LinkedList();
		this.flightnumber = " ";
	}
	
	public void addTakeOff(String number) {
		takeoutlist.add(number);
	}
	
	public void addLanding(String number) {
		landinglist.add(number);
	}
	
	public String handleNextAction() {
		while(!landinglist.isEmpty()) {
			String plane = landinglist.poll();
			activities_landed.add(plane);
			return plane + " is landing.\n";
		}
		while(landinglist.isEmpty()&& !takeoutlist.isEmpty()) {
			String plane = takeoutlist.poll();
			activities_taken.add(plane);
			return plane + " is taking off.\n";
		}
		return "";
	}
	public String waitingPlanes() {
		if(takeoutlist.isEmpty() || landinglist.isEmpty()) {
			return "There is no Landing and takeout plane.\n";
		}
		else {
			while(!takeoutlist.isEmpty()) {
			System.out.println("Planes waiting for takeout are : \n");
			return takeoutlist.element().toString() + " ";
			}
		System.out.println("\n");
		while(!landinglist.isEmpty()) {
			System.out.println("Planes waiting for takeout are : \n");
			return landinglist.element().toString() + " ";
			}
		}

    return " ";
	
	}
	 public String log() {
	        System.out.println("List or landing/take-off activities");
	        while(!activities_landed.isEmpty() || !activities_taken.isEmpty()) {
	            return "Flight " + activities_taken + " is taken-off\nFlight " + activities_landed + " landed." ;
	 }
	        
	            return "No flight has landed or taken-off";
	    }
	
	
}

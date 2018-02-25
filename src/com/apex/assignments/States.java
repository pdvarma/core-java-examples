package com.apex.assignments;

import java.util.ArrayList;

public class States {
	private int state_code;
	private String state_name;
	private String capitals;
	
	
	public States(int state_code, String state_name, String capitals) {
		super();
		this.state_code = state_code;
		this.state_name = state_name;
		this.capitals = capitals;
	}

	public int getState_code() {
		return state_code;
	}


	public void setState_code(int state_code) {
		this.state_code = state_code;
	}


	public String getState_name() {
		return state_name;
	}


	public void setState_name(String state_name) {
		this.state_name = state_name;
	}


	public String getCapitals() {
		return capitals;
	}


	public void setCapitals(String capitals) {
		this.capitals = capitals;
	}
	@Override
	public String toString() {
		String state = "";
		state += "\nState Code: " + getState_code();
		state += "\nState Name: " + getState_name();
		state += "\nCapital: " + getCapitals();
		return state;
	}
	
	public static void main(String[] args) {
		int n = 10;
		ArrayList<States> states = new ArrayList<States>(n);
		States place1 = new States(35801,"Alabama","Montgomery");
		States place2 = new States(90001,"California","Sacromento");
		States place3 = new States(80201,"Colorado","Denver");
		States place4 = new States(19901,"Delaware","Dover");
		States place5 = new States(32501,"Florida","Tallahassee");
		States place6 = new States(04032,"Maine","Augusta");
		States place7 = new States(67201,"Kansas","Topeka");
		States place8 = new States(02101,"Massachusetts","Boston");
		States place9 = new States(107039,"New Jersey","Trenton");
		States place10 = new States(97201,"Oregon","Salem");
		states.add(place1);
		states.add(place2);
		states.add(place3);
		states.add(place4);
		states.add(place5);
		states.add(place6);
		states.add(place7);
		states.add(place8);
		states.add(place9);
		states.add(place10);
		System.out.println(states);
		
		
		
		
	}
}

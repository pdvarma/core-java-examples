package com.apex.assignments;

import java.util.ArrayList;
import java.util.*;

public class UsStates {

	public static void main(String[] args) {
		int n = 50;
		ArrayList<String> states = new ArrayList<String>(n);
		String[] us_states = { "California", "Alabama", "Arkansas", "Arizona", "Alaska", "Colorado",
				"Connecticut,", "Delaware,", "Florida,", "Georgia,", "Hawaii,", "Idaho,", "Illinois,", "Indiana,",
				"Iowa,", "Kansas,", "Kentucky,", "Louisiana,", "Maine,", "Maryland,", "Massachusetts,", "Michigan,",
				"Minnesota,", "Mississippi,", "Missouri,", "Montana,", "Nebraska,", "Nevada,", "New Hampshire,",
				"New Jersey,", "New Mexico,", "New York,", "North Carolina,", "North Dakota,", "Ohio,", "Oklahoma,",
				"Oregon,", "Pennsylvania,", "Rhode Island,", "South Carolina,", "South Dakota,", "Tennessee,", "Texas,",
				"Utah,", "Vermont,", "Virginia,", "Washington,", "West Virginia,", "Wisconsin,", "Wyoming" };

		for (int i = 0; i < us_states.length; i++) {
			states.add(us_states[i]);
			//System.out.print(states);
		}
		System.out.print(states);
		
		HashSet<String> states_list = new HashSet<String>(n);
		
		
	}
}

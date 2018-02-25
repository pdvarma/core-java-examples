package com.apex.assignments;

import java.util.HashMap;

// Problem 11 : HashMap state code and state name and print them.

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<String, Integer> states = new HashMap<>();
		states.put("Alabama", 35801);
		states.put("Alaska", 99501);
		states.put("Arizona", 85001);
		states.put("Arkansas", 72201);
		states.put("California", 90001);
		states.put("Colorado", 80201);
		states.put("Connecticut", 06101);
		states.put("Delaware", 19901);
		states.put("DC", 20001);
		states.put("Florida", 32501);
		states.put("Georgia", 30301);
		states.put("Hawaii", 96801);
		states.put("Idaho", 83254);
		states.put("Illinios", 60601);
		states.put("Indianan", 46201);
		states.put("Iowa", 52801);
		states.put("Kansas", 67201);
		states.put("Kentucky", 41701);
		states.put("Loisiana", 70112);
		states.put("Maine", 04032);
		states.put("Maryland", 21201);
		states.put("Massachusetts", 02101);
		states.put("Michigan", 49036);
		states.put("Minnesota", 55801);
		states.put("Mississippo", 39530);
		states.put("Missouri", 63101);
		states.put("Montana", 59044);
		states.put("Nebraska", 68901);
		states.put("Nevada", 89501);
		states.put("New Hampshire", 03217);
		states.put("New Jersey", 107039);
		states.put("New Mexico", 87500);
		states.put("New York", 10001);
		states.put("North Carolina", 27565);
		states.put("North Dakota", 58282);
		states.put("Ohio", 44101);
		states.put("Oklahoma", 74101);
		states.put("Oregon", 97201);
		states.put("Pennsylvania", 15201);
		states.put("Rhode Island", 202840); // 2
		states.put("South Carolina", 29020);
		states.put("South Dakota", 57401);
		states.put("Tennessee", 37201);
		states.put("Texas", 78701);
		states.put("Utah", 84321);
		states.put("Vermont", 05751);
		states.put("Virginia", 24517);
		states.put("Washington", 98004);
		states.put("West Virginia", 25813);
		states.put("Wisconsin", 53201);
		states.put("Wyoming", 82941);
		System.out.println(states.size());

		System.out.println(states);

	}

}

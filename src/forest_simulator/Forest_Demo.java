package forest_simulator;

import java.util.*;

public class Forest_Demo {

	public static void main(String[] args) {
		
		System.out.println("Part 1:\n");
		
		//lets plant some plants (1 per unique class)
		
		//trees
		
		Oak oak = new Oak("Oak");
		Spruce spruce = new Spruce("Spruce");
		
		//bushes
		
		Blackberries black = new Blackberries("Blackberry");
		Raspberries rasp = new Raspberries("Raspberry");
		Wild_Rose rose = new Wild_Rose("Wild Rose");
		
		
		//example of polimorph bindings
		
		Plant[] all_plants = new Plant[5];
		all_plants[0]= oak;
		all_plants[1]= spruce;
		all_plants[2]= black;
		all_plants[3]= rasp;
		all_plants[4]= rose;
		
		
		//lets make a list of all plants in the forest
		
		List<Plant> forest = new ArrayList<Plant>();
		for(int i = 0; i< 5; i++){
			forest.add(all_plants[i]);
		}
		
		//and show it in console
		
		System.out.println("All plants in forest:");
		System.out.println(forest);
		
		//*******************************************************
		
		System.out.println("\nPart 2:\n");
		
		//lets use some polimorph
		//every kind of plant grows different way
		
		for(Plant plant : forest){
			try {
				plant.get_older(2.9);
				plant.grow();
			} catch (ExcPlantIsBurned e) {
				System.out.println(e.getMessage());
			}
		}
		
		//*******************************************************
		
		System.out.println("\nPart 3:\n");
		
		//declare our hashmap
		//Plant will get an individually key in index of endangered plants
		
		HashMap<Plant, Integer>	IndexOfEndangered = new HashMap<>();
		
		IndexOfEndangered.put(all_plants[0], 3534);
		IndexOfEndangered.put(all_plants[1], 3245);
		IndexOfEndangered.put(all_plants[2], 6544);
		IndexOfEndangered.put(all_plants[3], 6856);
		IndexOfEndangered.put(all_plants[4], 6899);
		
		//lets show it in console
		
		for (HashMap.Entry<Plant,Integer> entry : IndexOfEndangered.entrySet()){
			System.out.println(entry.getKey() + " is on the position: " + entry.getValue() + " in World's Index of endangered species.");
		}
		
		//*******************************************************
		
		System.out.println("\nPart 4:\n");
		
		//*** lets see some exceptions ***
		
		System.out.println("\nPart 4a:\n");
		
		//^^^ trees implement interface DropLeaves ^^^
		
		//Oak has leaves so it can drop it once
		
		try {
			oak.drop();
		} catch (ExcNoLeaves | ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		//but only once
				
		try {
			oak.drop();
		} catch (ExcNoLeaves | ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		
		//Spruce can't drop it's leaves because it's coniferous
		
		
		try {
			spruce.drop();
		} catch (ExcNoLeaves | ExcPlantIsBurned e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		System.out.println("\nPart 4b:\n");
		
		//^^^ bushes implement interface GetFruit ^^^
		
		//Blackberries have some fruit so we can get them
		
		try {
			black.get_fruit();
		} catch (ExcPlantIsBurned | ExcMoscquitoes | ExcNoFruit e) {
			System.out.println(e.getMessage());
		}
		
		//but only once
		
		try {
			black.get_fruit();
		} catch (ExcPlantIsBurned | ExcMoscquitoes | ExcNoFruit e) {
			System.out.println(e.getMessage());
		}
		
		//Raspberries have some fruit but have mosquitoes also!
		
		try {
			rasp.get_fruit();
		} catch (ExcPlantIsBurned | ExcMoscquitoes | ExcNoFruit e) {
			System.out.println(e.getMessage());
		}
		
		
		//Wild_Rose has no fruit ;(
		
		try {
			rose.get_fruit();
		} catch (ExcPlantIsBurned | ExcMoscquitoes | ExcNoFruit e) {
			System.out.println(e.getMessage());
		}
		
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		System.out.println("\nPart 4c:\n");
		
		//Additionally we can't do anything with burned plant ;(
		
		try {
			rasp.burn_plant();
		} catch (ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		try {
			rasp.grow();
		} catch (ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		try {
			rasp.get_older(56);
		} catch (ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		try {
			rasp.get_age();
		} catch (ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		try {
			rasp.get_height();
		} catch (ExcPlantIsBurned e) {
			System.out.println(e.getMessage());
		}
		
		try {
			rasp.get_fruit();
		} catch (ExcPlantIsBurned | ExcMoscquitoes | ExcNoFruit e) {
			System.out.println(e.getMessage());
		}
		
		//***************************************************************
		
		System.out.println("\nPart 5:\n");
		
		
		//at the end lets burn the whole forest ;)
		//Raspberries can't be burned second time
		
		for(Plant plant : forest){
			try {
				plant.burn_plant();
			} catch (ExcPlantIsBurned e) {
				System.out.println(e.getMessage());
			}
		}
		
		//thanks for your attention 
				
	}

}

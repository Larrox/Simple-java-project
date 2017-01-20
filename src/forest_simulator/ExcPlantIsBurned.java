package forest_simulator;

public class ExcPlantIsBurned extends Exception{
	
	String name;
	
	public ExcPlantIsBurned(String name) {
		this.name =name;
	}

	@Override
	public String getMessage() {
		return "WARNING: the plant: "+ this.name +" is burned, you can't do anything with it!";
	}

}

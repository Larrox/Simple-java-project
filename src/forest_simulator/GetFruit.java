package forest_simulator;

public interface GetFruit {
	void setfruit(boolean fuit);
	boolean getfruity();
	boolean getmoscquitoes();
	boolean getburned();
	String getName();
	
	default void get_fruit() throws ExcPlantIsBurned, ExcMoscquitoes, ExcNoFruit{
		
		if(getburned()){
			throw new ExcPlantIsBurned(getName());
		}
		else if(getmoscquitoes()){
			throw new ExcMoscquitoes(getName());
		}
		else if(!getfruity()){
			throw new ExcNoFruit(getName());
		}
		
		System.out.println("You got some delicious fruit from: " + this.getName());
		this.setfruit(false);
		
	}

}

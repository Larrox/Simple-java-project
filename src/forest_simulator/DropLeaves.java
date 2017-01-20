package forest_simulator;

public interface DropLeaves {
	void setleaves(boolean leaves);
	boolean getleafy();
	boolean getburned();
	String getName();
	
	default void drop() throws ExcNoLeaves, ExcPlantIsBurned{
		
		
		if(getburned()){
			throw new ExcPlantIsBurned(getName());
		}
		else if(!getleafy()){
			throw new ExcNoLeaves(getName());
		}
		
		this.setleaves(false);
		System.out.println("The tree: " + getName() +" dropped it's leaves");
	}

}

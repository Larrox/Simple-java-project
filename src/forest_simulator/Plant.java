package forest_simulator;

public abstract class Plant {
	
	double age;
	double height;
	boolean burned;
	String name;
		
	void get_older(double years) throws ExcPlantIsBurned{
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		
		this.age+=years;
	}
	
	void get_age() throws ExcPlantIsBurned{
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		System.out.println(this.name+ " is " + this.age + " years old.");
	}
	
	void get_height() throws ExcPlantIsBurned{
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		System.out.println(this.name+ " is " + this.height + "m height.");
	}
	
	
	void burn_plant() throws ExcPlantIsBurned{
		
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		this.burned = true;
		System.out.println(this.name + " is burned successfully.");
	}
		
	public String toString() { 
	    return this.name;
	} 
	
	abstract void grow() throws ExcPlantIsBurned;

}

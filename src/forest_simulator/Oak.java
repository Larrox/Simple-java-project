package forest_simulator;

public class Oak extends Tree {
	
	Oak(String name){
		this.age=0;
		this.height=0;
		this.burned=false;
		this.leafy=true;
		this.radius_of_trunk=0;
		this.name=name;
		System.out.println(this.name + " is planted successfully.");
	}
	
	@Override
	void grow() throws ExcPlantIsBurned {
		
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		
		if(age<=60){
			this.height=this.age*0.7;
			this.radius_of_trunk=this.age*2;
		}else{
			this.height=42;
			this.radius_of_trunk=120;
		}
		
		System.out.println(this.name + " is " + this.height + "m height and has " + this.radius_of_trunk + "cm radius of trunk.");
	}

	@Override
	public void setleaves(boolean leaves) {
		this.leafy= leaves;
		
	}

	@Override
	public boolean getleafy() {
		// TODO Auto-generated method stub
		return this.leafy;
	}

	@Override
	public boolean getburned() {
		// TODO Auto-generated method stub
		return this.burned;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

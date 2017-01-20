package forest_simulator;

public class Raspberries extends Bush {
	
	Raspberries(String name){
		this.age=0;
		this.height=0;
		this.burned=false;
		this.fruits=true;
		this.moscqitoes=true;
		this.name=name;
		System.out.println(this.name + " is planted successfully.");
	}

	@Override
	void grow() throws ExcPlantIsBurned{
		if (burned){
			throw new ExcPlantIsBurned(this.name);
		}
		
		if(this.age<=2){
			this.height=this.age;
		}else{
			this.height=2.1;
		}
		
		this.get_height();
		
	}

	@Override
	public void setfruit(boolean fruit) {
		this.fruits = fruit;
		
	}

	@Override
	public boolean getfruity() {
		// TODO Auto-generated method stub
		return this.fruits;
	}

	@Override
	public boolean getmoscquitoes() {
		// TODO Auto-generated method stub
		return this.moscqitoes;
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

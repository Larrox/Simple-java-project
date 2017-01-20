package forest_simulator;

public class ExcNoFruit extends Exception{
	
	String name;
	
	public ExcNoFruit(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}

	@Override
	public String getMessage() {
		return "WARNING: the bush: "+ this.name +" has no fruit!";
	}

}

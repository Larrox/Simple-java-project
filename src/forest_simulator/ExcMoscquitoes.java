package forest_simulator;

public class ExcMoscquitoes extends Exception{
	
	String name;
	
	public ExcMoscquitoes(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}

	@Override
	public String getMessage() {
		return "WARNING: the bush: "+ this.name +" has hundreds of mosquitoes, better run away!";
	}

}

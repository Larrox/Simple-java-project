package forest_simulator;

public class ExcNoLeaves extends Exception{
	
	String name;
	
	public ExcNoLeaves(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}

	@Override
	public String getMessage() {
		return "WARNING: the tree: "+ this.name +" has no leaves! (it's coniferous or leaves are already drpped)";
	}

}

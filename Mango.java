package Exercise4_4;

public class Mango extends Fruit { //sub class for Fruit
	
	protected String size;
	protected String taste;
	
	public Mango(String name, String size, String tatse) {
		super(name);
		this.size = size;
		this.taste = tatse;
		
		System.out.println("Manggo is contstructor invoked.");
	}
	
	public String size() {
		return this.size;
	}
	
	public String tatse() {
		return this.taste;
	}
} //end for class Mango

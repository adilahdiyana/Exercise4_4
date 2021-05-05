package Exercise4_4;

public class Strawberry extends Fruit { //sub class for Fruit
	
	protected int calories;
	protected boolean different;
	
	public Strawberry(String name, int calories, boolean different) {
		super(name);
		this.calories = calories;
		this.different = different;
		
		System.out.println("Strawberry is constructor invoked.");
	}
	
	public int calories() {
		return this.calories;
	}
	
	public boolean different() {
		return this.different;
	}
} //end for class Strawberry

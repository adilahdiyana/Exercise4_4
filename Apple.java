package Exercise4_4;

public class Apple extends Fruit { //sub class for Fruit
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double price, int quantity) { //constructor with 3 arguments
		super(name); //inherit
		this.price = price;
		this.quantity = quantity;
		
		System.out.println("Apple constructor is invoked.");
		
		if(this.quantity < 30) {
			totalPrice(); //overloading with no arguments bcs of price & quantity is remained same
			System.out.println(name);
			System.out.println("If quantity is LESS than 30, the total price of apples is RM" + totalPrice());
		}
		
			else if(this.quantity > 30 && this.quantity < 130) {
				double p = 1.50; //p=price
				totalPrice(p); //overloading with 1 argument
				System.out.println(name);
				System.out.println("If quantity is MORE than 30, the total price of apples is RM" + totalPrice(p));
	    }
		
			else {
				double p = 1.00; //can buy more than 130, the price will be 1.00
				double d = 0.5; //d=discount //buy more than 130 will get discount 50%
				totalPrice(p, d); //overloading with 2 arguments
				System.out.println(name);
				System.out.println("If quantity is MORE than 130, the total price of apples is RM" + totalPrice(p, d));
		}	
				
}
	
	public double totalPrice() {
		return this.price*this.quantity;
	}
	
	public double totalPrice(double p) {
		return p*this.quantity;
	}
	
	public double totalPrice(double p, double d) {
		return (p*this.quantity)*d;
	}
} //end for class Apple

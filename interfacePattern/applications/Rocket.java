package interfacePattern.applications;
/*2018112021 최은지*/

public class Rocket {

	private String name;
	private double price;
	private double apogee;
	
	public Rocket(String name,double price, double apogee) {
		this.name=name;
		this.price=price;
		this.apogee=apogee;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getApogee() {
		return apogee;
	}

}

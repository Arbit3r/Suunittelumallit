package tasks;

public class Jasper {
	
	private Hat hat;
	private Tshirt tshirt;
	private Pants pants;
	private Shoes shoes;
	
	
	public Hat getHat() {
		return hat;
	}
	public void setHat(Hat hat) {
		this.hat = hat;
	}
	public Tshirt getTshirt() {
		return tshirt;
	}
	public void setTshirt(Tshirt tshirt) {
		this.tshirt = tshirt;
	}
	public Pants getPants() {
		return pants;
	}
	public void setPants(Pants pants) {
		this.pants = pants;
	}
	public Shoes getShoes() {
		return shoes;
	}
	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}
	
	public void showOff() {
		System.out.println("All My stuff!" + " Hat: " + hat.toString() + " T-shirt: " +
		tshirt.toString() + " Pants: " + pants.toString() + " Shoes: " + shoes.toString());
	}
	
	

}

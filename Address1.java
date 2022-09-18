package javaclass.prowings.basics.cloning;

public class Address1 implements Cloneable{
	String city;
	String country;
	int pin;
	public Address1() {
		super();
	}
	public Address1(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address1 [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();	}
	
}

package javaclass.prowings.basics.cloning;

public class Address {
	String City;
	String State;
	int pin;
	
	public Address(String city, String state, int pin) {
		super();
		City = city;
		State = state;
		this.pin = pin;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", pin=" + pin + "]";
	}
	
	
	
}

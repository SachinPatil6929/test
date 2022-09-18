package javaclass.prowings.basics.cloning;

public class Student1 implements Cloneable{
	int roll;
	String name;
	Address1 address;
	
	public Student1() {
		super();
	}

	public Student1(int roll, String name, Address1 address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	protected Object clone()throws CloneNotSupportedException{
		Student1 dummyStd = (Student1) super.clone();
		Address1 addr = (Address1) address.clone();
		dummyStd.address=addr;
		return dummyStd;
	}
	
	

}

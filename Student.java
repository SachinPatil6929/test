package javaclass.prowings.basics.cloning;

public class Student implements Cloneable {
	int roll;
	String name;
	Address address;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("Pune","Maharashtra",411018);
		Student s1 = new Student(10,"Raj", addr);
		System.out.println("Befor Cloning s1- "+s1);
		
		Student s2 =(Student) s1.clone();
		System.out.println("Befor Cloning s2 -"+s2);
		
		System.out.println(">>>>>>>>>>Changing Adress of s1<<<<<<<<<");
		
		s1.address.City="Kolhapur";
		
		System.out.println("After Cloning s1 -"+s1);
		System.out.println("After Cloning s2 -"+s2);
		
        System.out.println(">>>>>>>>>>Changing Name of s2<<<<<<<<<");
		
		s2.name="Sachin";
		
		System.out.println("After Cloning s1 -"+s1);
		System.out.println("After Cloning s2 -"+s2);
	}
	

}

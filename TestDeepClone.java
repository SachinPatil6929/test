package javaclass.prowings.basics.cloning;

public class TestDeepClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 address = new Address1("Kolhapur","India",416211);
		Student1 s1 = new Student1(10,"Sachin",address);
		System.out.println("Original s1 = "+s1);
		Student1 s2 = (Student1) s1.clone();
		System.out.println("Cloned s2 = "+s2);
		
		s1.address.city="Pune";
		System.out.println("Original s1 after change = "+s1);
		System.out.println("Cloned s2 after change in Original = "+s2);
		
		System.out.println("s1 hashcode = "+s1.hashCode()+"   "+s1.address.hashCode());
		System.out.println("s2 hashcode = "+s2.hashCode()+"   "+s2.address.hashCode());
		
		
	}

}

package javaclass.prowings.basics.cloning;

public class Employee implements Cloneable {
	int id;
	String name;
	AccountDetails acc;
	public Employee() {
		super();
	}
	public Employee(int id, String name, AccountDetails acc) {
		super();
		this.id = id;
		this.name = name;
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", acc=" + acc + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Employee emp = (Employee) super.clone();
		AccountDetails ads = (AccountDetails) acc.clone();
		emp.acc = ads;
		return emp;
		
	}
	

}

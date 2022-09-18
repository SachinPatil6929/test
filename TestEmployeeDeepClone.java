package javaclass.prowings.basics.cloning;

public class TestEmployeeDeepClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		AccountDetails acc = new AccountDetails(416211,"State Bank", "Akshay");
		Employee emp = new Employee(124,"Sachin",acc);
		
		System.out.println("Original emp = "+emp);
		Employee emp1 = (Employee) emp.clone();
		System.out.println("Cloned emp1 = "+emp1);
		
		emp1.acc.bankName="Union Bank";
		System.out.println("Original emp after change = "+emp);
		System.out.println("Cloned emp1 after change in emp bank = "+emp1);
		
		System.out.println("emp hashcode = "+emp.hashCode()+"   "+emp.acc.hashCode());
		System.out.println("emp1 hashcode = "+emp1.hashCode()+"  "+emp1.acc.hashCode());
		
		emp.acc.accNo =143;
		System.out.println("Original emp after change = "+emp);
		System.out.println("Cloned emp1 after change in emp bank = "+emp1);
		
		System.out.println("emp hashcode = "+emp.hashCode()+"   "+emp.acc.hashCode());
		System.out.println("emp1 hashcode = "+emp1.hashCode()+"  "+emp.acc.hashCode());
		
	}

}


package javaclass.prowings.basics.cloning;

public class AccountDetails implements Cloneable{
	int accNo;
	String bankName;
	String nominee;
	
	public AccountDetails() {
		super();
	}

	public AccountDetails(int accNo, String bankName, String nominee) {
		super();
		this.accNo = accNo;
		this.bankName = bankName;
		this.nominee = nominee;
	}

	@Override
	public String toString() {
		return "AccountDetails [accNo=" + accNo + ", bankName=" + bankName + ", nominee=" + nominee + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}

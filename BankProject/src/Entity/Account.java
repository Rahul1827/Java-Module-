package Entity;

public class Account {
	
	
	private int accountNo;
	private String accountHolderName;
	private double balance;
	
	//default constructor
	public Account() {
		
		accountNo=0;
		accountHolderName=null;
		balance=0.0;
		
	}


	public Account(int accountNo, String accountHolderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", balance=" + balance
				+ "]";
	}

	
	
	
}

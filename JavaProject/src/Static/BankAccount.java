package Static;




public class BankAccount {

	private int accNo;
	private double balance;
	private static int idNum=1;
	
	
	public BankAccount() {
	accNo=idNum++;
	balance=0;
	}
	
	
	
	public BankAccount( double balance) {
		super();
		this.accNo = idNum;
		this.balance = balance;
	}



	public static int getIdNum()

	{
		return idNum;
		
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}



	public static void main(String[] args) {
		
		
		System.out.println(idNum);
		
		System.out.println(BankAccount.getIdNum());
		
		BankAccount bankAccount = new BankAccount();
	      System.out.println(bankAccount.getIdNum());
		
			BankAccount bankAccount2 = new BankAccount();
		      System.out.println(bankAccount2);
		      
		  	BankAccount bankAccount3 = new BankAccount(6000);
		      System.out.println(bankAccount3);

	}

}

package AbstractDemo;

abstract class BankAccount{
	
	protected int id;
	protected float balance;
	
	

public   BankAccount(int id , float balance) {
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.balance=balance;
	}
abstract public float calculateInterest();

	
}
	
	



class CurrentAcount extends BankAccount{

	public CurrentAcount(int id, float balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}



	private static final float Interest_rate=0.7f;
		
		
	
	public float calculateInterest() {
	return balance*0.7f;
	}
	
	
	
	
}

class SavingAccount extends BankAccount{

	public SavingAccount(int id, float balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return balance*0.56f;
	}
	
	
	
	
	
}

class LoanAccount extends BankAccount{

	public LoanAccount(int id, float balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return balance *0.10f;
	}
	
	
	
	
}


public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CurrentAcount acc1= new CurrentAcount(1, 2000);
		SavingAccount acc2= new SavingAccount(2, 5000);
		LoanAccount acc3= new LoanAccount(3, 100000);
		
		
		System.out.println("Interest of Current account  is "+acc1.calculateInterest());
		System.out.println("Interest of Saving account  is "+acc2.calculateInterest());
		System.out.println("Interest of Loan account  is "+acc3.calculateInterest());
		
	}

}

package module6;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account= new Account();
		
		account.setAccNo(102);
		account.setName("Anjan");
		account.setAccBalance(50000);
		
		System.out.println(account);
		
		System.out.println("*********************************************************");
		System.out.println("Parameterized constructor");
		
		Account account1= new Account(101, "Rahul", 5100000);
		System.out.println(account1);

	}

}

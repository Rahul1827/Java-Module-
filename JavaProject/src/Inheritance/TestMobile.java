package Inheritance;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile mobile=new Mobile("Motorola",101, "Black","4500mhz", "5G", 35000);
		System.out.println(mobile);
		
		
		System.out.println("**************************************************");
		
		Keypad keypad = new Keypad("Nokia", 102, "Red", "5500mhz", "2G", 5000, "2G", "normal", "Good", "Good");
		System.out.println(keypad);
		
		System.out.println("****************************************************");
		
		SmartPhone smartPhone = new SmartPhone("Iphone", 16, "Golden", "6000mhz", "5G", 180000, "4G/5G", "Best", "Good", "Best", "IOS", true, true, true)
;
		
		
		System.out.println(smartPhone);
	}

}

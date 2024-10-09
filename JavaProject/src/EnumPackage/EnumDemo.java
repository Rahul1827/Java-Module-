package EnumPackage;

import javax.management.ValueExp;

interface Interface1 {

	String comp = "OFS";

}

enum Month implements Interface1 {

	JAN, FEB, MAR, APR, MAY;

	public void fun1() {
		System.out.println("this is fun1");

	}

}

//enum Month{                                1
//	
//	JAN,FEB,MAR,APR,MAY;
//}
public class EnumDemo {

//	enum Month{                                    2
//		
//		JAN,FEB,MAR,APR,MAY;
//	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		enum Month{
//			
//			JAN,FEB,MAR,APR,MAY;
//		}
//

		Month m = Month.MAR;
		Month m1 = Month.APR;
		Month m2 = Month.MAY;

//		System.out.println(Month.MAR);
//		System.out.println(Month.APR);
//		System.out.println(Month.MAY);

		System.out.println("m is " + m);
		System.out.println("m1 is " + m1);
		System.out.println("m2 is " + m2);

		System.out.println("-=-=-=-=-===-=-=-=-=-===-=-");

		for (Month mm : Month.values()) {
			System.out.println(mm);
		}

		m.fun1();

	}

}

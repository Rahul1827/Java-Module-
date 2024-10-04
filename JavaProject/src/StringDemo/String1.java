package StringDemo;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= new String("Rahul");
		String str2 = new String("Patil");
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 3));
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf(0));
		System.out.println(str.contains(str2));
		
		

	}

}

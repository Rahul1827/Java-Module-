package module6;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="100";
		String str2="500";
		String str3="200.24";
		String str4="100.39";
		
		
		System.out.println("Total is "+(Integer.parseInt(str1)+Integer.parseInt(str2)));
		System.out.println("Total is"+(Double.parseDouble(str3)+Double.parseDouble(str4)));
		System.out.println("total is "+(Float.parseFloat(str1)+Float.parseFloat(str2)));
		System.out.println("Max is"+(Integer.MAX_VALUE));
		System.out.println("Max is"+(Short.MAX_VALUE));
		System.out.println("Max is"+(Byte.MAX_VALUE));
		System.out.println("Min is "+(Integer.MIN_VALUE));
		
		
		
	}
	

}

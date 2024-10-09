package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Date date=new Date();
		//System.out.println(date.toString());
		
		//to format the date
		
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy-mm-dd 'at' hh:mm:ss a ");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy 'Year'");
		SimpleDateFormat sdf2=new SimpleDateFormat("mm 'Month'");
		SimpleDateFormat sdf3=new SimpleDateFormat("dd 'Date'");
		
		System.out.println("Date is "+sdf.format(date));
		
		System.out.println("=================================");
		System.out.println("Year is "+sdf1.format(date));
		System.out.println("=================================");
		System.out.println("Month  is "+sdf2.format(date));
		System.out.println("=================================");
		System.out.println("Month  is "+sdf3.format(date));
		
		
		

	}

}

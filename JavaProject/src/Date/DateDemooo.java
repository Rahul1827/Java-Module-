package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date= new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("d/m/y ");
		System.out.println(sdf.format(date));
		
		System.out.println("*********************************");
		SimpleDateFormat sdf1=new SimpleDateFormat("d MMM yyyy");
		System.out.println(sdf1.format(date));
		
		System.out.println("*********************************");
		SimpleDateFormat sdf2=new SimpleDateFormat("d MMM yyyy hh:mm:ss a ");
		System.out.println(sdf2.format(date));
		
		System.out.println("*********************************");
		SimpleDateFormat sdf3=new SimpleDateFormat("d MMMM yyyy");
		System.out.println(sdf3.format(date));

		System.out.println("*********************************");
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss a B");
		System.out.println(sdf4.format(date));

}}

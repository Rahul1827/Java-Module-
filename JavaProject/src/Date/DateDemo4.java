package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Date date=new Date();
		System.out.println(date.toString());
		
		TimeZone timezone =TimeZone.getTimeZone("CST");
		Calendar calender=Calendar.getInstance(timezone);
		
		
		int daw = calender.get(Calendar.DAY_OF_WEEK);
		
		int dam = calender.get(Calendar.DAY_OF_MONTH);
		int day = calender.get(Calendar.DAY_OF_YEAR);
		
		
		int m = calender.get(Calendar.MONTH);
		int y = calender.get(Calendar.YEAR);
		int h = calender.get(Calendar.HOUR);
		int mi = calender.get(Calendar.MINUTE);
		int s = calender.get(Calendar.SECOND);
		int mis = calender.get(Calendar.MILLISECOND);
		
		System.out.println("Day of the week"+daw);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Day of the month"+dam);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Day of the Year"+day);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Month " +m);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Year " +y);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		
		System.out.println("Hour "+h);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Minute " +mi);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("Second "+s);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("MiliSecond "+mis);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		
		System.out.println(daw + "/" +dam+ "/"+day+ "/"+h+ ":"+mi+ ":"+s+ ":"+mis);
		
		

	}

}

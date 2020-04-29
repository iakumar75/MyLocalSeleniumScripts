package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class currentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d = new Date();
//		System.out.println(d);
//		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
//		String f = df.format(d);
//		System.out.println(f);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	    int day =cal.get(Calendar.DAY_OF_WEEK);
	    System.out.println(day);
	

	}

}

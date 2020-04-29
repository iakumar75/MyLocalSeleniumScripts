package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		//ddMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

//		Mon Apr 27 17:12:42 BST 2020
//		27Apr2020_171242


	}

}

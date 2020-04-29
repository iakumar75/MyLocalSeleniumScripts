package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSystemDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);// Mon Apr 13 17:43:45 BST 2020
		// ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

	}

}

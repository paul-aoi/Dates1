package dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Dstes {
	static Scanner D = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Please enter start date");
		String dateStart = D.nextLine();
		
		System.out.println("Please enter end date");
		String dateStop = D.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

		Date date1 = null;
		Date date2 = null;

		try {
			date1 = format.parse(dateStart);
			date2 = format.parse(dateStop);


			long diff = date2.getTime() - date1.getTime();

			long days = TimeUnit.MILLISECONDS.toDays(diff);
			
			long months = days/30;
			
			long years = days/365;
			
			System.out.println(days + " days, or " + months +" months, or " +years +" years");
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
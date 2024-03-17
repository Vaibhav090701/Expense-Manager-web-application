package Model;

import java.util.Calendar;
import java.util.Date;

public class TransactionClass {
	
	public static String startPoint() {
		
		Calendar calendar=Calendar.getInstance();
		String startpoint="";
		int date=calendar.getActualMinimum(Calendar.DATE);
		
		Date d=new Date();
		
		int month=d.getMonth()+1;//1+1
		int year=d.getYear()+1900;//124+1900
		
		if(month<10)
		{
		startpoint=year+"-0"+month+"-"+date;
		}
		
		else {
			startpoint=year+"-"+month+"-"+date;

		}
		return startpoint;
	}


}

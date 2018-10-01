

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar1 {
	public static void main(String args[]) {
//		Date now = new Date();
//		System.out.print(now.getYear());
		Calendar now1= Calendar.getInstance();
		int year = now1.get(Calendar.YEAR);//멤버변수만 올 수 있음 정확히는 스태틱.
		int month = now1.get(Calendar.MONTH);//--->0이 1월
		int day = now1.get(Calendar.DATE);
		//GregorianCalendar now2= new GregorianCalendar(2022,11,30);
		//System.out.println(now2.getWeekYear());
//		BuddhistCalendar now3= new BuddhistCalendar();
	}
}

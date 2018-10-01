import java.util.*;

public class Calendar2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		Calendar date1=Calendar.getInstance();
		Calendar date2=Calendar.getInstance();
		date1.set(2018, 8,30);
		
		System.out.println("date1은"+ toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고");
		System.out.println("date2은"+ toString(date1)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일이다");
		long de=(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println(de);
		System.out.println(de/(20*60*60));
	
	}

	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
	}

}

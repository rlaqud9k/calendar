import java.util.Calendar;

public class Calendar4 {
	public static void main(String args[]) {
		Calendar now = Calendar.getInstance();
		Calendar now1 = Calendar.getInstance();
		now.set(2018,0,30);
		now1.set(2018,0,30);
		System.out.println(toString(now));
		System.out.println(toString(now1));
		now.add(Calendar.MONTH, 1);
		now1.roll(Calendar.MONTH, 1);
		System.out.println(toString(now));
		System.out.println(toString(now1));
//		now.add(Calendar.DATE, 1);
//		now1.roll(Calendar.DATE, 1);
//		System.out.println(toString(now));
//		System.out.println(toString(now1));
	}
	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"³â"+(date.get(Calendar.MONTH)+1)+"¿ù"+date.get(Calendar.DATE)+"ÀÏ";
	}
}

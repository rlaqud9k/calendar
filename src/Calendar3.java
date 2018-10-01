import java.util.Calendar;

public class Calendar3 {

	public static void main(String[] args) {
		final int[]TIME_UNIT= {3600,60,1};
		final String [] TIME_UNIT_NAME = {"�ð�", "��","��"};
		
		Calendar time1 =Calendar.getInstance();
		Calendar time2 =Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY,10);
		time1.set(Calendar.MINUTE,20);
		time1.set(Calendar.SECOND,30);
		time2.set(Calendar.HOUR_OF_DAY,20);
		time2.set(Calendar.MINUTE,30);
		time2.set(Calendar.SECOND,10);
		System.out.println("time1"+time1.get(Calendar.HOUR_OF_DAY)+"��"+time1.get(Calendar.MINUTE)+"��"+time1.get(Calendar.SECOND)+"��");
		System.out.println("time2"+time2.get(Calendar.HOUR_OF_DAY)+"��"+time2.get(Calendar.MINUTE)+"��"+time2.get(Calendar.SECOND)+"��");
		long di=Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis())/1000;
		System.out.println("t1��t2�� ���̴�"+di+"�Դϴ�.");
		String tmp="";
		for(int x=0;x<TIME_UNIT.length;x++) {
			tmp+=di/TIME_UNIT[x]+TIME_UNIT_NAME[x];
			di%=TIME_UNIT[x];
		}
		System.out.println("�ú��ʺ�ȯ"+tmp+"��");
	}

}

package dateYear;

import java.util.Calendar;
import java.util.Date;

public class DateYear {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		Date date=calendar.getTime();
		System.out.println("Current date "+date);
		int day=calendar.get(Calendar.DATE);
		System.out.println("Current day "+day);
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println("Current month "+month);
		int year = calendar.get(Calendar.YEAR);
		System.out.println("Current year "+year);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("current day of week "+dayOfWeek);
		int dayOfMonth=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Current day of month "+dayOfMonth);
		int dayOfYear=calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("Current day of year "+dayOfYear);
		int weekOfMonth=calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("Week of month "+weekOfMonth);
		

	}

}

package t06_String;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		String tel = "010-3423-2704";
		List<String> telList = new ArrayList();
		
		String[] telArray = tel.split("-");
		for (int i = 0; i < telArray.length; i++) {
			telList.add(telArray[i]);
		}
		
		List<String> telLi = Arrays.asList(tel.split("-"));
		
		System.out.println(telList);
		System.out.println(telLi);
		
		// join도 공부하삼
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strSdf = sdf.format(new Date());
		System.out.println(strSdf);
		
		
		
//		Calendar now = Calendar.getInstance();
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DATE);
		
		System.out.println("결과: " + year + month + day);
		
		int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		String strWeek = "일월화수목금토";
		System.out.println(strWeek.charAt(week-1));
		
	}
}

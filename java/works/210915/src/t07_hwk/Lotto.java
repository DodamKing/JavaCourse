package t07_hwk;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Lotto {
	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<Integer>();
		for (int i=0; i<6; i++) {
			lotto.add((int)(Math.random()*45) + 1);
			for (int j=0; j<i; j++) {
				if (lotto.get(i) == lotto.get(j)) {
					i--;
				}
			}
		}
		
		System.out.println("정렬되기 전 로또번호: " + lotto);
		
		Collections.sort(lotto);
		
		int year = Calendar.getInstance().get(Calendar.YEAR); 
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // 1월이 0이라 +1
		int day = Calendar.getInstance().get(Calendar.DATE);
		int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1; // 일요일이 1이라 -1
		int weekOfMonth = Calendar.getInstance().get(Calendar.WEEK_OF_MONTH);
		String strWeek = "일월화수목금토";
		
		System.out.printf("%d년 %d월 %d일 %s요일, 이번주 로또 번호를 예측합니다.\n", year, month, day, strWeek.charAt(week));
		System.out.println(month + "월 " + weekOfMonth +"주차 로또번호: " + lotto);
	}
}

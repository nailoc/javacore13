package com.hk.app;

import java.util.Calendar;  // 1번 기억 java.util.Date --> Calendar
import java.util.Date;		// 자바에서 잘 사용하지 않고 프론트로 정보를 전달하는 경우

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar cal = new Calendar(); // 이렇게 사용안함
		// 시스템에서 내부적으로 사용되는 시간은 동일하므로 하나의 객체를 가지고 구현
		// 호출방법 : getInstance() 메소드를 사용
		Calendar cal = Calendar.getInstance(); //getInstance() 안에서 참조변수를 정의한다
		System.out.println("연도:" + cal.get(Calendar.YEAR)); // 연도정보를 가져오는 상수
		System.out.println("월:" + (cal.get(Calendar.MONTH)+1) );  // 0~11까지 
		System.out.println("날:" + cal.get(Calendar.DATE));
		
		//요일
		System.out.print("요일:"+cal.get(Calendar.DAY_OF_WEEK)); // 1:일 2:월 ....7:토
		if(cal.get(Calendar.DAY_OF_WEEK) == 2) { // 조건문으로 요일출력 가능
			System.out.println(" 월요일");         // 달력그릴 때 필요함
		}
		System.out.println("오전오후:"+ cal.get(Calendar.AM_PM)); // 0:AM 1:PM
		System.out.println("12시기준:"+ cal.get(Calendar.HOUR));
		System.out.println("24시기준:"+ cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:" + cal.get(Calendar.MINUTE));
		System.out.println("초:" + cal.get(Calendar.SECOND));
		
		System.out.println("현재달의 마지막날:" + cal.getActualMaximum(Calendar.DATE));
		
		// 자바에서는 날자계산 - Calendar 클래스 사용함
		// 프론트웹에 날짜값을 전달하는 경우 Calendar --> Date 포멧변경
		// cal 현재시간
		Date today = new Date(cal.getTimeInMillis());
		String day = today.toString();
		System.out.println("현재날짜: " + day);
		
	}

}

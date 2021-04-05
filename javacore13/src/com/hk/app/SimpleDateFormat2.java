package com.hk.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());   // 타임스탬프
		Date today = new Date(cal.getTimeInMillis());
		System.out.println(today.toString()); 
		//Mon Apr 05 16:59:37 KST 2021  // Date 객체의 출력형식
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf.format(today));

	}

}

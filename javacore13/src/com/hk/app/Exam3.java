package com.hk.app;

import java.util.Calendar;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 연도를 입력, 달 입력
		Scanner reader = new Scanner(System.in);
		System.out.print("연도를 입력하시오:");
		int year = reader.nextInt();
		System.out.print("월을 입력하시오:");
		int month = reader.nextInt();
		
		// 달력을 계산
		cal.set(Calendar.YEAR, year);		//연도변경
		cal.set(Calendar.MONTH, month-1); 	//월변경 : 달이 0부터시작됨
		cal.set(Calendar.DAY_OF_MONTH, 1); 	//일변경
		//cal.set(year, month-1, 1);		//동시변경 
		
		int end = cal.getActualMaximum(Calendar.DATE);// 마지막날짜
		// 시작요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);// 1:일 5:목
		
		// 달력을 출력하시오
		System.out.println("===================="+ year + "년 " + month +"월 ====================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=================================================");
		
		// 시작요일 찍기
		for(int w=1; w<dayOfWeek; w++) {
			System.out.print("★\t");
		}
		// 카운터설정
		int cnt = dayOfWeek - 1;	// 시작하는 요일 전까지 공백 출력 갯수
		
		// 날짜 찍기
		for(int i=1; i<=end; i++) {
			System.out.print(i+"\t");
			cnt++;
			if(cnt%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=================================================");

	}

}

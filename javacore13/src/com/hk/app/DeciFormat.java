package com.hk.app;

import java.text.DecimalFormat; // java.text 패키지 사용
import java.text.ParseException;

public class DeciFormat {

	public static void main(String[] args) {
		// 숫자를 표시함 -> DecimalFormat 클래스
		// 10000000 => 10,000,000 형식화해서 출력
		DecimalFormat df = new DecimalFormat("#,###.###");  // 형식을 정의함
		
		double calResult = 123456789.3456;
		System.out.println("총금액: " + df.format(calResult) );    // 형식화 메소드 format()
		
		String dataResult = "34,567,734.23";                // 포멧화된 문자열
		try {
			
			Number calResult2 = df.parse(dataResult);       // 리턴타입 Number 레퍼클래스
															// 숫자화 메소드 parse()
			double calRes2 = calResult2.doubleValue();
			System.out.println(calResult+calRes2);          // E7 -> 10의7승
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		

	}

}


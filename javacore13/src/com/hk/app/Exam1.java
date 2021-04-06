package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		// 좌표범위는 0~10사이에서 계산
		int width=11, height = 11;
		// 토끼의 좌표, 풀의 좌표
		int rabX; int rabY;  // 각가의 좌표를 대입
		int grX; int grY;    // 각가의 좌표를 대입
		
		// 토끼의 좌표 중앙에 있다고 가정
		rabX = width / 2;   // 5
		rabY = height / 2; 	// 5
		// 풀의 좌표는 랜덤하다고 가정
		grX = (int) Math.floor(Math.random()*width);
		grY = (int) Math.floor(Math.random()*height);
		
		// mapDist 클래스를 사용하여 거리를 출력하시오
		mapDist rab2gr = new mapDist(rabX, rabY, grX, grY);  // 생성자를 통해서 초기화
		rab2gr.calDistance();
		
		System.out.println("토끼와 풀의 거리는:"+rab2gr.dist);

	}

}

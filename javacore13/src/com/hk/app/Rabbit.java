package com.hk.app;

// 자식 클래스
// 인터페이스 상속받으면 반드시 메소드를 재정의 - why? 추상메소드
 
// 2번째 인터페이스는 interface 사용해서 생성
// 3번째 상속은 implements 사용하여 다중상속이 가능함
public class Rabbit extends Character2 implements Item, Weapon { // 클래스 상속   extends 사용
	
	boolean life;

	// 다중상속이 가능하다
	@Override
	public void useFastShoes() {
		// 3칸씩 이동을 하도록 구현
	}
	
	public void move( ) {
		// 한칸씩 이동을 한다
	}

	@Override
	public void attack() {
		
		// 늑대가 나타나면 공격하는 무기 사용
		
	}

}

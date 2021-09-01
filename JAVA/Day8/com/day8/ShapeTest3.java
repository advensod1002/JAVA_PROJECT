package com.jcp.day8;

import test.Rectangle;

// 다형성을 확인하는 예제
// 의미는 하나지만 실체 형태는 여러가지가 될수있음 --> 메소드 오버라이딩으로 궇현
public class ShapeTest3 {

	public static void main(String[] args) {
		
		// 객체 참조타입이 자기자신의 타입이 아닌 부모(상위)클래스 타입으로 했습니다
		Shape sh1 = new Triangle("작은 삼각형", 32, 16);
		Shape sh2 = new Rectangle("큰 직사각형", 56, 87);
		
		// sh1 sh2 객체가 Shape 타입이지만 실제 객체는 다릅니다 그래서 getArea 실행 동작도 다름
		System.out.println(sh1.getArea());	// getArea 재정의(오버라이딩)
		System.out.println(sh2.getArea());
		// 다형성을 이용해서 하위클래스 모두 Shape 배열에 참조시킬수 있음
		
		Triangle tri = (Triangle)sh1;	// 자식클래스 타입으로 캐스팅 -> 자식클래스 필드,메소드 사용
		System.out.println("sh1 삼각형 직각? " + tri.rightAngle);
		// Triangle tri2 = (Triangle)sh2;
		// 하위클래스를 모두 Shape 배열에 참조시킬수 있습니다 
	}

}

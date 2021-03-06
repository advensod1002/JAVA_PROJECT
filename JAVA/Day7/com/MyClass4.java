package com.jcp.day7;

import java.util.Arrays;

// 클래스의 생성자 역할, 생성자 활용을 연습합니다
public class MyClass4 {
	
	// 필드 선언
	String name;
	int level;
	double[] point;		// 참조타입 변수
	
	// 기본 생성자는 인자가 없는 형식
	// 생성자를 커스텀하게(필요에 따라) 정의 해봅시다.
	public MyClass4() {
		// 필드값을 참조타입은 기본값 null 수치 기본형 데이터는 0으로 초기화
	}
	
	public MyClass4(String name, int level, double[] point) {
		// new 연산으로 생성할 때 인자로 초기값을 전달
		this.name = name;
		this.level = level;
		this.point = point;
	}
	
	public MyClass4(String name, int level) {	// 필요에 따라 일부 필드만 초기화할 수 있는 생성자
		this.name = name;
		this.level = level;		
	}
	
	// 아래의 setXXX 메소드는 초기화와 값의 변경 2가지 용도로 사용할수 있습니다
	void setName(String name) {		// name은 참조값
		this.name = name;
	}
	
	// level 필드값 저장하기
	void setLevel(int level) {
		this.level = level;
	}
	
	// point 필드값(참조값) 저장하기
	void setPoint(double[] point) {
		this.point = point;
	}
	
	void print() {
		System.out.println("name : " + name + ", level : " + level + ", points : " + Arrays.toString(point));
	}
}

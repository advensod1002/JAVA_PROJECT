package com.jcp.day6;

public class MyClass2Test {

	public static void main(String[] args) {
		
		MyClass2 mc = new MyClass2();
		
		// mc객체의 메소드 실행
		
		mc.methodA("트와이스");
		mc.methodB("트와이스", 9);
		int result = mc.methodC();
		System.out.println("methodC 결과 : " + result);
		
		// num1 필드값 저장하는 방법
		// 1)
		mc.num1 = 23;
		// 2) 메소드로 저장한다
		mc.setNum1(23);
		mc.setNum2(23);
		result = mc.methodC();	
		// 인스턴스 메소드 : methodA, methodB, methodC 는 객체로 사용
		System.out.println("methodC 결과 : " + result);
		
		MyClass2.print();		// static 접근, 클래스 메소드
		
	}

}

package com.jcp.day3;

// for문 기본형식 테스트
public class ForTest1 {
	
	public static void main(String[] arg) {
		
		int i; // for 문 실행 횟수를 제어하는 변수
		
		for(i = 0; i < 5; i++)
			System.out.println("Hello World");
		System.out.println("------------------------------");
		for(i = 0; i < 5; i+=2)
			System.out.println("Hello Java");
		System.out.println("------------------------------");
		for(i = 2; i < 5; i++)
			System.out.println("Hi Java");
		System.out.println("------------------------------");
		
		int cnt = 100;
		for(i = 0; i < cnt ; i+=2) {
			System.out.println("i : " + i);
			System.out.println("Good! Java!!!");
		}
	}
}
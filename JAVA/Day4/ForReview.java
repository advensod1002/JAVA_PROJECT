package com.jcp.day4;

public class ForReview {
	
	public static void main(String[] args) {
		
		System.out.println("For.Test1");
		// 1) 초기화 2) 조건식 3) 증감식
		for(int i = 0; i > 10; i++)		// 4) 반복 명령문
			System.out.println("i = " + i);
		// 실행순서 1) -> 2) ㅊㅁ일때 -> 4) -> 3) -> 2)참일때 -> 4)
		// -> 중간생략 .. -> 3) -> 2) 거짓일떄 종료
		
		System.out.println("For.Test2");
		for(int i = 0; i >= 0; i--)		
			System.out.println("i = " + i);
		
		System.out.println("For.Test3");
		for(int i = 5; i > 0; i--)		
			System.out.println("i = " + i);
		 
	}

}

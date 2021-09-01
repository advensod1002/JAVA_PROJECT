package com.jcp.day5;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {		// step3
		
		// nextInt() 와 nextLine()을 함께 사용하는 테스트 --> StringTest2 문제점 수정

		Scanner sc = new Scanner(System.in);
		
		int age; 
		String name;
		
		System.out.print("이름 입력하세요 >>> ");
		name = sc.nextLine();			
		// 345 는 정수, "345"는 문자열
		System.out.print("나이 입력하세요 >>> ");
		age = sc.nextInt();				// 엔터 이전까지만 버퍼에서 가져가 처리 (저장)
		// "ab" 문자열은 nextInt() 메소드는 정수로 변환 못하고 오류
		// "123" 문자열은 nextInt() 메소드가 정수로 변환 하여 처리, 저장
		System.out.println("name : " + name + "( " + age + " ) 환영합니다.!");
		
		sc.close();
	}

}

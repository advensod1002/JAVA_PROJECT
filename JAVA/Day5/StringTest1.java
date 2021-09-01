package com.jcp.day5;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {		// step1
		
		// 객체 : 메모리에 저장된 데이터 뭉치. 클래스 타입으로 만들어지므로 이에 해당하는 필드 메소드를 사용할 수 있다

		Scanner sc = new Scanner(System.in);
		String name;		// String 클래스 타입의 참조변수 name -> String 객체를 사용할 수 있다
		
		// Scanner 클래스의 문자열 입력 메소드 : next(), nextLine()
		
		System.out.print("이름 1 입력하세요 >>> ");
		name = sc.next();								
		// 공백 문자이전까지 저장 ---- 입력 = 홍 길동 버퍼에 " 길동" 남아있음
		System.out.println("next() 입력 확인 : " + name);
		
		System.out.print("이름 2 입력하세요 >>> ");
		name = sc.nextLine();		// 공백, 엔터 이전까지 저장
		//nextLine() 메소드의 리턴타입이 String이므로 String 타입변수에 대입되어야 한다
		System.out.println("nextLine() 입력 확인 : " + name);
		
		// 메소드 프로토타입(구조) ---> 메소드마다 다른 형태
		// String java.util.Scanner.nextLine()
		// 1) 	  2)패키지명.클래스명		3) 		4)
		
		// 1) 리턴타입		String 
		// 2) 메소드의 소속	java.util.Scanner
		// 3) 메소드 이름 	nextLine
		// 4) argument	없음 
		// 메소드를 사용할 때는 2)번 부분이 참조변수(인스턴스 메소드) or 클래스명(클래스 메소드)이 된다
		
		sc.close();
	}

}

package com.jcp.day1;

import java.util.Scanner; 
// Scanner 클래스는 기본 클래스가 아니므로 import가 필요
// java.lang 패키지에 있는 기본 클래스느느 import 없이 사용


// 키보드 입력 테스트
public class KeyInputTest {

	public static void main(String[] args) {
		// 키보드 입력은 표준 입력 : System 클래스 in 필드를 사용
		// --> 다양한 데이터 입력을 처리하기 위해 Scanner 클래스를 사용
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력 준비
		int num;
		System.out.println("정수값 1개 입력하세요. >>> ");
		num = sc.nextInt();						// 키보드 입력 실행. 입력내용 -> 정수로 처리
		System.out.println("입력받은 값 : " + num);
		
		double height, width;
		double area;
		
		System.out.println("높이 값을  입력하세요. >>> ");
		height = sc.nextDouble();
		System.out.println("높이는 : " + height);
		
		System.out.println("너비 값을  입력하세요. >>> ");
		width = sc.nextDouble();
		System.out.println("너비는 : " +width);
		
		
		area = height * width;
		System.out.printf("시각형 넓이는 = %.3f", area);
		

	}

}

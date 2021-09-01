package com.jcp.day3;

import java.util.Scanner;

public class WhileTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intValue;
		char charValue;
		
		while(true) {		// 종료조건 intValue 입력값이 999일때 종료
			System.out.println("아스키 코드 정수 값 입력하세요.(32 ~ 126) >>> ");
			intValue = sc.nextInt();
			if(intValue == 999) break; // while 종료
			
			//32보다 작거나 126보다 크면 다시 입력하도록 코드 추가
			if(intValue < 32 || intValue > 126) {
				System.out.println("잘못된 값입니다. 다시 입력하세요");
				continue;
			}
			charValue = (char)intValue;
			System.out.println("아스키 코드 : " + intValue + ", 문자 : " + charValue);
		}		
		System.out.println("프로그램을 종료합니다.");
		
		// 추가적인 연습은 StringTest2.java 코드를 적용해서 아스키 코드값의 분류를 출력해보기
		
		String result;
		charValue = (char)intValue;
		if(charValue >='A' && charValue <='Z')
			result ="대문자";
		else if(charValue >='a' && charValue <='z')   
			
			result ="소문자";
		else if(charValue >='0' && charValue <='9')		
			
			result ="숫자";
		else			
			result ="unknown";
			 
	}

}

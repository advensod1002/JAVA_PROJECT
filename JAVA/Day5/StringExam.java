package com.jcp.day5;

public class StringExam {
	// 문제
	public static void main(String[] args) {
		// 문자열 "kor_sec20_20_21@gmail.com";
		// -> 숫자의 갯수를 출력합니다. 위의 예는 숫자 갯수 총 4개입니다
		// 메소드는 charAt 사용사여 문자를 1개씩 검사합니다.
		// 반복 횟수는 문자열의 길이를 구하는 length 메소드를 이용합니다
		
		String email = "kor_sec20_21@gmail.com";
		char ch;		
		int cnt = 0;
		
		System.out.println(email);
		for(int i = 0; i < email.length(); i++) {
			ch = email.charAt(i);
			if(ch >= '0' && ch<= '9') cnt++;			
			}
		System.out.println("문자열 email의 숫자 갯수는 " + cnt + " 입니다.");
		}
	}

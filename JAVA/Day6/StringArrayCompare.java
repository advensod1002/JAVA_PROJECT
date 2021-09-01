package com.jcp.day6;
/*
 * 반복문 안에서 String 배열이 참조하는 문자열을 비교하는 테스트
 */

import java.util.Scanner;

public class StringArrayCompare {
	
	public static void main(String[] args_) {
		Scanner sc = new Scanner(System.in);
		String[] strArray = {"continue", "break", "switch", "constant", "identifier", "array", "break", "print"};
		String[] korArray = {"계속", "종료", "선택", "상수", "식별자", "배열", "탈출", "출력"};
		// 비교 : equals 메소드, contains 메소드, 사전식비교(a<b<c<...<z) 매소드
		// 찾고 싶은 문자열
		String find;
		boolean result = false;
		System.out.print("find 문자열 입력하세요. >>> ");
		find = sc.nextLine();
		for(int i = 0; i < strArray.length; i++) {
			System.out.println("i = " + i + ", 찾는 값? " + strArray[i].equals(find));
			
			if(strArray[i].equals(find)) { // 배열에 문자열 중복이 허용되지 않을 때 break 사용
				System.out.println("find 를 찾았습니다..........");
				System.out.println("i = " + i + ", 영문 + " + strArray[i] + ", 한글 = " + korArray[i]);
				result = true;
			}
		}
		// 찾는 문자열이 한번도 없었다면
		if(!result) // ! 연산자는 true 는 false로 false는 true로 바꾸는 not 부정연산자 (논리연산자 종류)
			System.out.println("검색결과 : 찾는 자열이 없습니다.ㅠ");
	}

}

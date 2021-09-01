package com.jcp.day6;

import java.util.Arrays;

public class StringMethodTest5 {

	// 문자열 비교 : 사전식 비교 메소드
	public static void main(String[] args) {
		// 문자 char, 정수 데이터형은 값의 비교를 관계연산자(<, >, <=, >=)로 했습니다
		// 문자열 비교는 못합니다 compareTo 메소드로 합니다
		
		String str = "hello";
		
		// str.compareTo(비교 문자열) : str - 비교문자열 형식으로 실행
		
		System.out.println(str.compareTo("cat"));		// str보다 앞에 있는 문자열 결과값 > 0
		System.out.println(str.compareTo("hello"));		// str과 같은 문자열 결과값 == 0
		System.out.println(str.compareTo("switch"));	// str보다 뒤에 있는 문자열 결과값 < 0
		
		// 문자열의 비교는 대표적인 예로 순서대로 정렬하고 싶을 때 사용
		String[] strArray = {"continue", "break", "switch", "constant", "identifier", "array", "break", "print"};
		
		// 정렬을 제공하는 클래스와 그의 메소드 Arrays 클래스의 sort 메소드
		Arrays.sort(strArray);
		// 정렬이 잘 되었는지 출력
		for(int i = 0; i < strArray.length; i++)
			System.out.print(strArray[i] + " ");
		
		System.out.println();
		// Arrays 클래스에는 배열의 값을 인덱스 순서대로 출력하는 메소드 toString도 있습니다
		System.out.println(Arrays.toString(strArray));
	}

}

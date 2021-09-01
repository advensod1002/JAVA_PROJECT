 package com.jcp.day4;

public class CharArrayTest {
	public static void main(String[] args) {
		
		// char 형 데이터는 문자('') 를 2바이트 크기로 저장합니다.
		char[] charArr = {'하', '이', '~', '자', '바', '!', '재', '밌', '다','.'};
		System.out.println("--- char 배열의 값을 출력 ---");
		for(int i = 0; i < charArr.length; i++)
			System.out.println(charArr[i]);
		
		System.out.println("--- char 배열의 인덱스 2값을 수정하고 출력 ---");
		charArr[2] = '*';
		System.out.println(charArr);		// 참조변수를 이용하여 출력하면 문자배열은 String 형태로 출력
		
		System.out.println("--- char 배열과 String 타입과의 변환 ---");
		System.out.println("1. String 타입을 char 배열로 변환");		// char 배열로 바꿔서 처리하는 작업이 더쉬울때 변환해서 사용
		String temp = "헬로우!!자바**";
		
		char[] tempArr = temp.toCharArray();	// Quiz : 클래스 메소드 or (*인스턴스 메소드*)
												// 인자 X return 형식은 char[]
		for(int i = 0; i < tempArr.length; i++)
			System.out.println(tempArr[i]);
		
		// hello java 를 암호로 만드는 망법(고대시대) 암호키 cat
		// catcatcatc -> 문자하나씩 취급 할때 String -> char
		
		System.out.println("2. char 배열을 String으로 변환");		// 예를 들면, 처리가 완료된 char 배열을 String으로 변환해야할때
		char[] tempArr2 = {'p','l','e','a','s','e','~','!','.'};
		String chString = String.valueOf(tempArr2);		// Quiz : (*클래스 메소드*) or 인스턴스 메소드 _ 인자 = char[]
		// System.out.println(chString[4]); chString은 배열이 아니므로 인덱스 사용 못함
		System.out.println(tempArr2);
		
		// 객체 타입이 바뀌는게 무슨 의미가 있나 - 사용할 수 있는 필드와 메소드가 달리진다 
		// 클래스의 구성요소 필드, 메소드
		
	}

}

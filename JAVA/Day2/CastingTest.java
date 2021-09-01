package com.jcp.day2;

public class CastingTest {
	
	public static void main(String[] args) {
		
		byte byteValue = 123;		// 자동변환 왼쪽 byte = 오른쪽 int 리터럴
		int intValue = 123;
		char charValue = 'a';
		
		// 데이터 타입의 작은 형식 ~ 큰 형식 나열
		// byte < short < int < long < float < double
		// = 는 대입문 이라고 하며 오른쪽의 값을 왼쪽으로 대입
		
		
		// 오른쪽의 값 큰크기 형식을 왼쪽 작은 크기의 변수에 대입하면 오류;
		// 1) -> 강제변환(캐스팅)은 가능하지만 값이 정확하지 않아진다		
		byteValue = (byte)245;
		System.out.println("강제 변환된 결과 : " + byteValue);
		// byteValue = 245; 오류
		
		// 2) 큰 크기 형식 = 작은 크기 형식 -> 자동변환으로 저장된다
		intValue = byteValue;
		intValue = charValue;
		System.out.println("자동변환된 결과 : " + intValue);
		
		// 아스코드값 101을 inValue 에 저장해서 해당되는 문자가 무엇인지
		// -> charValue 에 저장(캐스팅 핑요)해서 출력
		intValue = 101;
		charValue = (char)intValue;
		System.out.println("아스키 코드 : " + intValue + ", 문자 : " + charValue);
		
	}

}

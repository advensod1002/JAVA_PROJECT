package com.jcp.day2;

/*
 * 데이터형식 char : 문자1개를 저장하기위해 2바이트를 사용하는 형식
 * 문자는 기호  but 문자를 식별하기 위한 정수값으로 표현되는 코드를 갖는데 여러종류의 문자코드가 있습니다. 
 * : 아스키코드(기본), 유니코드,.....
 * 자바는 기본적으로 문자값으로 유니코드를 사용.
 */

public class CharacterTest {

	public static void main(String[] args) {
		
		char c1 = 'A';	// 문자는 '' 안에 표시
		char c2 = 65;	// 65는 문자에 대한 아스키코드 값
		char c3 = '가';
		char c4 = '\uac00';		// 16 진수 \\u는 16진수 표시
		char c5 = 44032;
		char c6 = '\ud7a3';
		char c7 = '힣';
		char c8 = 55203;
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("c7 : " + c7);
		System.out.println("c8 : " + c8);
		
		// 참고 : 문자 \시작하면 이스케이프 문자 대표적은 \n
		// 코드 또는 주석에서 \ 만나면 이스케이프 문자형식에 맞춰서 처리를 하려고 함
		// 형식에 맞지 않으면 이클립스 오류 표시 그래서 역슬래시 문자로 취급하려면 두번\\
		
		c1++;
		System.out.println("c1 +1 증가 : " + c1);
		
		c3++;
		System.out.println("c3 +1 증가 : " + c3);
		System.out.println("c3 +1 증가 : " + ++c3);
		System.out.println("c3 +1 증가 : " + ++c3);
		System.out.println("c3 +1 증가 : " + ++c3);
		
		// 16진수(HexDecimal) 데이터를 사용하는 코드
		int hexa1 = 0x7a3;		// 16진수 0x로 시작
		System.out.println("hexa1 값 : " + hexa1);
		
		int dec1 = 44032;
		System.out.printf("10진수 %d를 16진수로  : %x", dec1, dec1 );
		
		
	}

}

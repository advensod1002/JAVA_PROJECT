package com.jcp.day2;

public class DoubleTest {

	public static void main(String[] args) {
		
		// 실수 데이터(double과 float)의 풀력과 연산셜과 확인
		double d2 = 1.12345678901234567890123456789; // 실수의 기본형식
	    float f2 = 1.12345678901234567890123456789f;
	    
	    System.out.println( "double 1.12345678901234567890123456789 : " + d2 ); // 소수점이하 자리 16자리  
	    System.out.println( "float 1.12345678901234567890123456789 : " + f2 ); //  소수점이하 자리 7자리
	    
	    System.out.println( "지수형식 2e3 : " + 2e3 );       // 2000.0 2 x 10의 3승
	    System.out.println( "지수형식 2e-3 : " + 2e3 );		 // 0.002 2 x 10의 -3승
	    // 실수 : 부동소수점 형식(0 과 1)으로 처리하는데 있어서 발생하는 문제점 2진수를 10진수로 변환해서 출력할때
	    
	    System.out.println( 0.1 + 1.6 ); // 1.7000000000000002 
	    System.out.println( 3.0 / 0.0 ); // Infinity 무한대 실수 0.0 으로 나눈 결과
	    System.out.println( 0.0 / 0.0 ); // NaN : Not a Number (실수 0.0을 나눌떄)
	    // System.out.println( 3 / 0 ); // Error 정수 0으로 나눌떄
	    }

}

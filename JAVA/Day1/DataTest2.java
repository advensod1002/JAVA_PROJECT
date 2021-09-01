package com.jcp.day1;


//실수 데이터를 저장하는 변수를 연습
public class DataTest2 {

	public static void main(String[] args) {
		
		double num1 = 3.1417;		// 8바이트 
		//실수는 double 이 기본, 실수를 리터럴로 쓸떄 f를 붙여서 float으로 지정
		float num2 = 3.1417f;		// 4바이트
		
		System.out.println("실수 num1 : " + num1);
		System.out.println("실수 num2 : " + num2);
		
		num1 = 2.456;
		num2 = 101.345f;
		
		System.out.println("실수 num1 : " + num1);
		System.out.println("실수 num2 : " + num2);
		
		System.out.println(":::Double 클래스로 Double 데이터타입 정보확인-byte :::");
		System.out.println("Double 변수의 크기 : " + Double.BYTES +" Byte");
		System.out.println("Double 변수의 최대값 : " + Double.MAX_VALUE);
		System.out.println("Double 변수의 최소값 : " + Double.MIN_VALUE);
		//3.4028235E38 에서 38E는 x10의 38승
		System.out.println(":::Float 클래스로 Float 데이터타입 정보확인-byte :::");
		System.out.println("Float 변수의 크기 : " + Float.BYTES +" Byte");
		System.out.println("Float 변수의 최대값 : " + Float.MAX_VALUE);
		System.out.println("Float 변수의 최소값 : " + Float.MIN_VALUE);
		
	 	// float 과 double의 차이는 소수점 이하 자리수가 많아졌다  ----> 정밀도의 차이

		 
		
		

	}

}

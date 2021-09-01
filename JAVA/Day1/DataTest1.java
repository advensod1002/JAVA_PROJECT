package com.jcp.day1;


// 정수 데이터를 저장하는 변수를 연습
public class DataTest1 {
	
	public static void main(String[] args) {
		// 변수의 선언(이름, 크기, 형식을 지정합니다)
		byte num0 = 23;		//1바이트, -128 ~ 127
		short num1 = 23;	//2바이트, -32768 ~ 32767
		int num2 = 23;		//4바이트, -2147483648 ~ 2147483647
		long num3 = 23;		//8바이트, -9223372036854775808 ~ 9223372036854775807

		System.out.println("num0 : " + num0);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		System.out.println(":::Byte 클래스로 byte 데이터타입 정보확인-byte :::");
		System.out.println("Byte 변수의 크기 : " + Byte.BYTES +" Byte");
		System.out.println("Byte 변수의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("Byte 변수의 최소값 : " + Byte.MIN_VALUE);
		
		//기본형 데이터가  필요에 따라 클래스로 변환되어야 할때 각 기본형에 대한 Wrapper 클래스를 사용합니다.
		//Integer, Byte, Short, Long, Character 등
		
		System.out.println(":::Integer 클래스로 int 데이터타입 정보확인-byte :::");
		System.out.println("Integer 변수의 크기 : " + Integer.BYTES +" Byte");
		System.out.println("Integer 변수의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("Integer 변수의 최소값 : " + Integer.MIN_VALUE);
		
		System.out.println(":::Short 클래스로 short 데이터타입 정보확인-byte :::");
		System.out.println("Short 변수의 크기 : " + Short.BYTES +" Byte");
		System.out.println("Short 변수의 최대값 : " + Short.MAX_VALUE);
		System.out.println("Short 변수의 최소값 : " + Short.MIN_VALUE);
		
		System.out.println(":::Long 클래스로 long 데이터타입 정보확인-byte :::");
		System.out.println("Long 변수의 크기 : " + Long.BYTES +" Byte");
		System.out.println("Long 변수의 최대값 : " + Long.MAX_VALUE);
		System.out.println("Long 변수의 최소값 : " + Long.MIN_VALUE);
		
		System.out.println(":::Character 클래스로 character 데이터타입 정보확인-byte :::");
		System.out.println("Character 변수의 크기 : " + Character.BYTES +" Byte");
		System.out.println("Character 변수의 최대값 : " + Character.MAX_VALUE);
		System.out.println("Character 변수의 최소값 : " + Character.MIN_VALUE);
		
		
		
		

	}

}

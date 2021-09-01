package com.jcp.day2;

public class WonToDollar {

	public static void main(String[] args) {
		
		int dollar; // 달러
		int  won; // 원
		
		// 키보드 입력으로 바꿀수 있게 값을 따로 초기화
		dollar = 1193; // 1달러
		won = 1000000; // 100만원을 달러로 환전함
		
		System.out.println("[환율계산]");
		System.out.println("환율 1달러 = " + dollar + "(원)");
		System.out.println("여행 환전 원화 = " + won + "(원)");
		
		double result;			// 838.22296...
		result = won / dollar;	
		// 연산식이 실행되는 데이터의 형식 -> 정수 나누기 정수 결과는 정수(몫)
		// 실수 결과를 원한다면 1) won, dollar 를 double로 선언한다 2) won, dollar 중 하나를 강제로 실수형식으로 변환 
		
		System.out.println("[환전되었습니다.]---------------");
		System.out.println("USD 달러 = " + result + "(달러)");
		// 결과 값에 대해 다른 요구사항을 생각해보세요
		
		// 실수로 변환된 won으로 나누기를 실행 : won을 강제로 실수형식으로 변환(casting)
		result = (double)won/dollar; // 캐스팅 할 데이터 앞에 (데이터형식)지정
		System.out.println("[환전되었습니다.]---------------");
		System.out.println("USD 달러 = " + result + "(달러)");
		System.out.printf("%s %12.5f %s", "USD 달러 = ", result, "(달러)");
		
		double doubleWon = won;
		result = doubleWon / dollar;
		System.out.println("[환전되었습니다.]---------------");
		System.out.println("USD 달러 = " + result + "(달러)");
		System.out.printf("%s %12.5f %s", "USD 달러 = ", result, "(달러)");
	}

}

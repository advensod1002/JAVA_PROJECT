package com.jcp.day4;

import java.util.Scanner;

public class CypherTest2 {

	public static void main(String[] args) {
		// 요구사항 : 철수가 미미에게 암호화된 메시지를 전달받았어요
		// 철수는 미미와 key값으로 7이라는 숫자를 알고있어요
		// 받은 메시지는 String 타입 "xxxxxxxx"
		// 암호화된 메시지를 복호화 하기 위해 -> 각 문자에 키값 7을 뺄셈합니다
		// 그리고 복호화 메시지를 String 타입으로 수신합니다(String 타입 결과 출력하세요)
		String message;
		String cypherText = "P'sprl'Qh}h5";
		int key = 7;
		char[] temp;
		temp = cypherText.toCharArray();
		System.out.println("--- 복호화 ---");
		for(int i = 0; i < temp.length; i++) temp[i] -= key;
		message = String.valueOf(temp);
		System.out.println(temp);
		}
	}

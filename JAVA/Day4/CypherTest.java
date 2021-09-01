package com.jcp.day4;

public class CypherTest {

	public static void main(String[] args) {
		// 요구사항 : 철수가 미미에게 메시지를 전달하는데 간단한 암호화를 합니다
		// 철수는 미미와 key값으로 7이라는 숫자를 알고있어요
		// 보내고 싶은 메시지는 "I like Java." -> 각 문자에 키값 7을 더해서 보냅니다.
		// 암호화된 메시지는 String타입으로 필요
		String message, cypherText;
		int key = 7;
		
		message = "I like Java.";
		System.out.print(message);
		System.out.println("\n--- 암호화 ---");
		char[] temp = message.toCharArray();
		for(int i = 0; i < temp.length; i++) {
			temp[i] += key;
			System.out.print(temp[i]);
			}
		System.out.println("\n--- 전송 ---");
		cypherText = String.valueOf(temp);
		System.out.println(temp);
	}

}

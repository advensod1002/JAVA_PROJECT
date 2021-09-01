package com.jcp.day4;

import java.util.Scanner;

public class CypherTest3 {

	public static void main(String[] args) {
		// 메시지 입력과 옵션을 선택하는 기능을 추가해봅시다
		// 1.암호화하기 2.복호화하기
		// 선택 >>>>
		// 메시지 >>>>
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message, cypherText;
		System.out.print("메시지를 입력하세요 >>> ");
		message = sc.nextLine();
		char[] temp = message.toCharArray();
		
		System.out.println("1.암호화하기 | 2.복호화하기 | 3.종료");
		System.out.print("선택 >>>> ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 :
			for (int i = 0; i < temp.length; i++) temp[i] += key;
			cypherText = String.valueOf(temp);
			System.out.println("암호화 : " + cypherText);
			break;
				
		case 2 :
			for (int i = 0; i < temp.length; i++) temp[i] -= key;
			cypherText = String.valueOf(temp);
			System.out.println("복호화 : " + cypherText);
			break;
			
		case 3 :
			System.out.println("종료합니다.");
			break;
		
		default :
			System.out.println("잘못 선택했습니다.");
			break;
			}
		}
	}
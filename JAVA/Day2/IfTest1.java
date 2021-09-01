package com.jcp.day2;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		
		// 관계연산자 : 연산결과값은 boolean 값(true false)
		// ==, !=, >=, <=, <, >, !(not)
		/*
		 boolean bcal = 3==4;
		 System.out.println("결과값 : " + bval);
		 bval = (4==4);
		 System.out.println("결과값 : " + bval);
		 */
		
		// int point 값(사용자 입력)이 1 ~ 100이면 "일반회원", 100초과이면 "VIP"
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if(num > 0 && num < 100) {
			System.out.println("일반회원");
			}else if(num > 100) {
				System.out.println("VIP");
			}else {
				System.out.println("");
			}
		
		// 요구사항2
		int point;
		point = sc.nextInt();
		if(point > 100)
			System.out.println("VIP 회원 입니다");
		else if(point >= 1) 
			System.out.println("일반 회원 입니다");
		else
			System.out.println("잘못된 값입니다");
		
		
		}
	}

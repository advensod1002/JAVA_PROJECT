package com.jcp.day3;

import java.util.Scanner;

// if 문을  switch 문으로 바꿔보는 예제
// 냐용은 여러개의 메뉴 중에 선택하는 조건으로 합니다
public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.println("[[사용자 메뉴]]");
		System.out.println("1:장바구니 2:상품목록 3:결제 4:배송조회 5:종료");
		System.out.println("선택하세요 >>> ");
		Scanner sc = new Scanner(System.in);
		int menu;
		menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("장바구니 입니다");
			System.out.println("🎁🎁🎁🎁🎁🎁");
		}else if(menu == 2) {
			System.out.println("상품목록 입니다");
			System.out.println("✔✔✔✔✔✔");
		}else if(menu == 3) { // menu 가 1, 2 아니고 3이라면
			System.out.println("결제 입니다");
			System.out.println("👀👀👀👀👀👀");
		}else if(menu == 4) {
			System.out.println("배송조회 입니다");
			System.out.println("😂😂😂😂😂😂");
		}else if(menu == 5) {
			System.out.println("종료 입니다");
			System.err.println("👍👍👍👍👍👍");
		}else
			System.out.println("잘못된 선택입니다");
		
		System.out.println("---------------------------------");
		System.out.println("\n::::: Switch :::::");
		
		switch(menu) {
		case 1 :
			System.out.println("장바구니 입니다");
			System.out.println("🎁🎁🎁🎁🎁🎁");
			break;
		case 2 :
			System.out.println("상품목록 입니다");
			System.out.println("✔✔✔✔✔✔");
			break;
		case 3 :
			System.out.println("결제 입니다");
			System.out.println("👀👀👀👀👀👀");
			break;
		case 4 :
			System.out.println("배송조회 입니다");
			System.out.println("😂😂😂😂😂😂");
			break;
		case 5 :
			System.out.println("종료 입니다");
			System.err.println("👍👍👍👍👍👍");
			break;
		default :
			System.out.println("잘못된 선택입니다");
		}
	}
}


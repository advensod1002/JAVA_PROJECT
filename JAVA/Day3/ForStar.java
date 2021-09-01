package com.jcp.day3;

import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		
		// ★☆
		int i, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평점을 몇점 주시겠습니까? (1 ~ 5) >>> ");
		num = sc.nextInt();
		for (i = 1; i <= 5; i++) {
			if (num >= i) System.out.print("★");
			else System.out.print("☆");
			}
		
		if (num >= 3)
			System.out.println("\n감사합니다.!!");
		
		System.out.println("------------------------------");
		
		System.out.print("평점을 몇점 주시겠습니까? (1 ~ 5) >>> ");
		num = sc.nextInt();
		for (i = 1; i <= 5; i++) {
			if (num >= i) System.out.print("★");
			else System.out.print("☆");
			}
		
		if (num < 3)
			System.out.print("\n아쉽군요!!");
		
	}
}
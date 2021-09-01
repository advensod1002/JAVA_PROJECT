package com.jcp.day6;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Score hong = new Score();
		Scanner sc = new Scanner(System.in);
		
		hong.name = "홍길동";
		
		System.out.print("국어 점수 >>> ");
		hong.kor = sc.nextInt();

		System.out.print("영어 점수 >>> ");
		hong.eng = sc.nextInt();
		
		System.out.print("수학 점수 >>> ");
		hong.math = sc.nextInt();
						
		hong.print();

	}

}

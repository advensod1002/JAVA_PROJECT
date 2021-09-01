package com.jcp.day2;

import java.util.Scanner;

public class MaxMinExam {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, Max = 0, Min = 0;
		
		System.out.println("정수 3개를 입력하세요.");
		n1 = sc.nextInt();
		System.out.println("n1 >>> " + n1);
		n2 = sc.nextInt();
		System.out.println("n2 >>> " + n2);
		n3 = sc.nextInt();
		System.out.println("n3 >>> " + n3);		
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
		
		if(n1 > n2) {
			Max = n1;
			Min = n2;
		}else {
			Max = n2;
			Min = n1;
		}
		
		if(n3 > Max) Max = n3;
		
		if(Min > n3) Min = n3;
		
		System.out.println("최대값 : " + Max + ", 최소값 : " + Min);
	}
}
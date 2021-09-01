package com.jcp.day1;

import java.util.Scanner;

public class RectangleTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double height, width;
		double area;
		
		System.out.println("높이 값을  입력하세요. >>> ");
		height = sc.nextDouble();
		height = sc.nextFloat(); // 자동형변환
		System.out.println("높이는 : " + height);
		
		System.out.println("너비 값을  입력하세요. >>> ");
		width = sc.nextDouble();
		System.out.println("너비는 : " +width);
		
		
		area = height * width;
		System.out.printf("시각형 넓이는 = %.3f", area);
		

	}


}
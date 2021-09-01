package com.jcp.day1;

public class RectangleTest {
	
	public static void main(String[] args) {
		double height = 10.12, width = 7.12;
		double area = height * width;
		System.out.println("사각형의 높이는 : " + height);
		System.out.println("사각형의 너비는 : " + width);
		
		System.out.print("\n사각형의 넓이는 : ");
		System.out.printf("%.2f * %.2f = %.3f", height, width, area);		
	}

}

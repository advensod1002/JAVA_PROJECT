package com.jcp.day8;

import test.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {

		Shape sh = new Shape("작은정사각형", 23, 12);		
		String shape = sh.getShapeName();
		int width = sh.getWidth();
		int height = sh.getHeight();
		int area = sh.getArea();		
		System.out.println(shape + " - 너비 : " + width + ", 높이 : " + height + ", 면적 : " + area);
		
		Triangle tr = new Triangle("직각삼각형", 34, 10);
		shape = tr.getShapeName();
		width = tr.getWidth();
		height = tr.getHeight();
		area = tr.getArea();		
		System.out.println(shape + " - 너비 : " + width + ", 높이 : " + height + ", 면적 : " + area/2);
		
		Rectangle re = new Rectangle("직사각형", 22, 15);
		System.out.println(re.getShapeName() + " - 너비 : " + re.getWidth() + ", 높이 : " + re.getHeight() + ", 면적 : " + re.getArea());
		
	}

}

package com.jcp.day9a;

public class ARectangle extends AShape{
	
	String shapeName;
	int height;
	int width;
	
	//기본 생성자, 커스텀 생성자 정의
	public ARectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public ARectangle(String shapeName, int width, int height){
		// 부모 생성자 호출
		super(shapeName, width, height);
	}
	
	@Override
	public int getArea() {
		int result = this.getWidth() * this.getHeight();
		return result;
	}

}

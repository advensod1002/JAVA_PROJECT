package com.jcp.day9a;

public class ATriangle extends AShape{
	
	String shapeName;
	int height;
	int width;
	
	//기본 생성자, 커스텀 생성자 정의
	public ATriangle() {
		// TODO Auto-generated constructor stub
	}
	
	public ATriangle(String shapeName, int width, int height){
		// 부모 생성자 호출
		super(shapeName, width, height);
		 //this.shapeName = shapeName;
		 //this.width = width;
		 //this.height = height;
	}
	
	// 추상 메소드는 반드시 정의해야한다
	@Override
	public int getArea() {
		int result = this.getWidth() * this.getHeight() / 2;
		return result;
	}
	// implements(구현) : 정의가 안되어있는 메소드 --> 정의해서 실행코드 작성

}

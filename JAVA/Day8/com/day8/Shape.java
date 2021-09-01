package com.jcp.day8;


//오늘의 주제 2: 클래스의 상속(다형성)
//Shape 클래스는 추상적인 상태. 구체적인 모양이 없다.
// ㄴ 자세하게(구체화된) 도형클래스를 만든다면 .. 삼각형,정사각형,직사각형,사다리꼴...
// ㄴ 구체화할 때 Shape 클래스를 상속받는다.
// ㄴ 상속하는 부모클래스는 반드시 기본생성자가 동작을 해야 자식 클래스도
//   기본 생성자를 사용할 수 있습니다.
public class Shape {		// 도형 클래스
	
	static final int MAX_WIDTH = 100;	// 상수
	
	// 필드 private 접근 -> 같은 파일 안에서만
	private String shapeName;
	private int width;
	private int height;
	
	// 1) 필드값 3개 초기화하는 생성자 만들어보세요
	public Shape(String shapeName, int width, int height) {
		
		// 필드 private 접근
		this.shapeName = shapeName;		// 도형이
		this.width = width;				// 도형의 크기 중 너비
		this.height = height;			// 도형의 크기 중 높이
	}
	
	// 2) 필드값 3개를 가져올수 있는 getXXX 메소드
	// get set 허락받고 쓰는 방법
	// default 메소드는 같은 패키지만
	// 다 쓰려면 public
	
	public String getShapeName() {
		return shapeName;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	// 3) setXXX 메소드는 없습니다 ('초기값을 바꿀수 없다'는  요구조건)
	
	// 4) 도형의 면적(넓이) 계산 하는 메소드 생성 (계산식은 너비 * 높이)
	public int getArea() {
		return width * height;
	}
	
	// protected 는 default와
		// 다른패키지 이면 자식 클래스만 접근할 수 있도록 제한
		// protected String shapeName;
		// protected int width;
		// protected int height;

	
	

}

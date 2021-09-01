package com.jcp.day9b;

public abstract class Animal {
	static final String TYPE = "동물";
	// 필드 공통적인 특성
	private String color;
	
	// 생성자
	public Animal() {
	}
	
	public Animal(String color) {
		this();		// 기본생성자 메소드 호출
		this.color = color;
	}
	
	// 추상메소드
	public abstract void sound();
	public abstract String getType();
	
	// 일반 인스턴스 메소드
	// 필드가 private 이면 읽고 쓰기 위해서 -> getter setter
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	

}

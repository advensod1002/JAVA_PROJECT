package com.jcp.day10;

public class Member {
	private String name;
	private int age;
	
	// 생성자 오버로딩 -> 커스텀 생성자 정의하면 인자 갯수와 형식이 달라집니다
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	// Object 클래스의 자동상속(Object의 자식 클래스 Member) --> 상속으로 Object 메소드 중 재정의 연습(toString 메소드)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString(); Object 클래스의 실행내용
		return "[ 이름 : " + name +  ", 나이 : " + age + "]";
	}
	

}

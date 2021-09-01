package com.jcp.day7;

import java.util.Scanner;

// Student 쿨래스 배열을 연습
public class StudentArrayTest {
	
	static final int SIZE = 3;

	public static void main(String[] args) {
		// 5명의 학생을 처리할수있는 배열
		// stus 배열의 인덱스에 저장된 값은 Student 객체를 참조값이다
		Student[] stus = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		stus[0] = new Student("사나", new int[] {78, 56, 98});
		stus[1] = new Student("다현", new int[] {68, 76, 83});
		stus[2] = new Student("모모", new int[] {78, 56, 98});
		stus[3] = new Student("미나", new int[] {75, 79, 67});
		stus[4] = new Student("정연", new int[] {88, 77, 66});
		
		for(int i = 0; i < stus.length; i++) stus[i].print();
		System.out.println();
		// 배열에 저장된 학생 중에 총점이 230 이상인 학생만 출력(이름,총점,평균)하기
		for(int i = 0; i < stus.length; i++) {
			if(stus[i].sum() >= 230)
				System.out.printf("%s - 총점 : %3d 평균 : %6.2f\n", stus[i].name, stus[i].sum(), (double)stus[i].sum()/SIZE);
			}
		
		//향상된 for문(또는 빠른 for문, for each)를 사용
		for(Student s : stus) {	// 인덱스 변수 i를 사용하는 대신에 stus의 객체를 하나씩 참조하게 코딩
			if(s.sum() >= 230)
				System.out.printf("%s - 총점 : %3d 평균 : %6.2f\n", s.name, s.sum(), (double)s.sum()/SIZE);
			
		}
		
		System.out.println();
		// 이름이 "미나"인 학생의 데이터 출력하기 : print() 메소드 사용
		for(int i = 0; i < stus.length; i++) {
			String temp = stus[i].name;
			if(temp.equals("미나"))
				stus[i].print();
			}
		
		// 검색할 학생 이름 사용자 입력으로 코드 추가
		System.out.print("검색할 이름 >>> ");
		String c = sc.nextLine();
		
		for(int i = 0; i < stus.length; i++) {
			String temp = stus[i].name;
			if(temp.equals(c))
				stus[i].print();
			}
		
		//for each로 수정
		for(Student s : stus) {
			String temp = s.name;
			if(temp.equals("미나")) {
				System.out.println("검색 결과 학생 이름 : " + s.name);
				System.out.println("과목별 성적........");
				for(int jumsu : s.scores) {
					System.out.print(jumsu + "(" + s.grade(jumsu) + ")");
				}
			}
		}
		sc.close();
	}
}


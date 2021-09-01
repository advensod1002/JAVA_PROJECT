package com.jcp.day7;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest2 {
	
	static final int SIZE = 3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int[] scores = new int[SIZE];
		
		System.out.print("이름 >>> ");
		name = sc.nextLine();
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("점수 >>> ");
			scores[i] = sc.nextInt();
		}
		
		Student sd = new Student(name, scores);
		
		sd.print();
		sc.close();
		
		Student st = new Student("홍길동", new int[] {80, 90, 10});
		st.print();
	}
}
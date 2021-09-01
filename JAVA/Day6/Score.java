package com.jcp.day6;

public class Score {
	int kor, eng, math;
	String name ;	
	
	int sum() {
		return kor + eng + math;		
	}
	
	double avg() {
		return (double)sum() / 3;
	}
	
	char grade(int score) {
		char result;
		if(score >= 90) result = 'A';
		else if(score >= 80) result = 'B';
		else if(score >= 70) result = 'C';
		else result = 'D';
		return result;
	}
	
	void print() {
		System.out.printf("%s - %3d(%c) %3d(%c) %3d(%c)  합계 = %3d  평균 = %.2f\n", name, kor, grade(kor), eng, grade(eng), math, grade(math), sum(), avg());
	}

}

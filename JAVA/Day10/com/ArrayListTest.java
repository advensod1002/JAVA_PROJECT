package com.jcp.day10;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int[] datas = {1, 5, 7, 9, 11};
		int[] datas2 = new int[100];	// 400 바이트
		
		// 1) 만약에 datas 배열에서 index 2번 값 7을 삭제하고 싶다 -> {1, 5, 9, 11}
		// ---> ArrayList 클래스로 해결
		//	index 2번으로 100으로 삽입하고싶다 -> {1, 5, 100, 7, 9, 11}
		// 2) 배열의 타입 : int double byte char short long float Object 타입 (모든 클래스 타입)
		// --> ArrayList 도 배열처럼 타입을 반영해야 합니다 : 제너릭 타입으로 구현 --> <> 안에 타입 표시
		// 3) 배열의 모든 값을 for 없이 출력 : Arrays.toString
		// --> ArrayList 타입 참조 변수로 출력
		// 4) 배열의 정렬(값 순서대로 나열) : Arrays.sort 메소드
		// --> ArrayList 객체로 sort 메소드 datas.rot(null)
		
		
		//ArrayList 사용
		ArrayList<Member> members = new ArrayList<>();
		ArrayList<Integer> idatas = new ArrayList<>();	// 기본형 타입 ArrayList
		
		idatas.add(123);	//  첫번째 데이터 123추가
		idatas.add(567);
		idatas.add(23);
		
		System.out.println("리시트의 크기  : " + idatas.size());
		System.out.println("리스트의 데이터 모두 출력---");
		
		for(int temp : idatas)
			System.out.println(temp);
		
		System.out.println(idatas);
		System.out.println("1번 인덱스 값 : " + idatas.get(1));
		
		// 리스트에서 데이터 삭제 : 인덱스 값으로 삭제 
		idatas.remove(1);
		System.out.println(idatas);
		
		// member 로 테스트 : 데이터 추가, 출력, 인덱스로 가져오기, 삭제
		members.add(new Member("사나", 23));
		members.add(new Member("미나", 25));
		members.add(new Member("다연", 21));
		System.out.println(members);
		
		// 특정 인덱스 위치에 데이터 추가
		members.add(1, new Member("정연", 28));
		System.out.println(members);
		
		// 5) 같은 값이 있는지 검사하는 메소드 contains
		System.out.println(idatas.contains(124));
		System.out.println(idatas.contains(123));
	}

}

package com.jcp.day3;

import java.util.Scanner;

// 먼저 정수 배열을 테스트 합니다
public class ArrayTest1 {
	
	public static void main(String[] args) {
		
		// 선언 방법
		// 1) 정수데이터 4개를 초기값을 주고 선언 - 배열의 크기는 4
		int[] arr1 = {78, 65, 89, 94};	// 배열값의 초기화
		// 2) 정수 데이터 10개를 저장할수 있음 - 배열의 크기 10
		int[] arr2 = new int[10];		// new는 객체를 생성하는 연산자, 배열의 크기만 정하고 값은 주지 않는다
					// 배열의 크기만 정하고 값은 주지 않는다 초기값은 기본 0
		
		// 배열의 값을 출력 - 인덱스(위치를 나타내는 값)
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}
		
		// arr2배열에 사용자가 입력한 값으로 데이터를 저장하고
		// 1)전체 출력 2)그 중에 짝수를 출력하는 코딩 3) 소수 출력
		int[] arr3 = new int[7];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 7; i++) {
			System.out.println("배역에 저장할 값 >>> ");
			arr3[i] = sc.nextInt();
		}
		System.out.println("--- 전체 출력 ---");
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d] = %d\n", i, arr3[i]);
		}
		
		System.out.println("--- 짝수 출력 ---");
		for(int i = 0; i < arr3.length; i++) {
			if(arr3[i] % 2 == 0)
			System.out.printf("arr3[%d] = %d\n", i, arr3[i]);
		}
		System.out.println("--- 소수 출력 ---");
		for(int i = 0; i < arr3.length; i++) {			
			int n = arr3[i];
			boolean result = true;
			for(int k = 2; k <= n/2; k++) { 
				if(n % k == 0) {
					result = false;
					break;
				}
		}
			if(n == 1) result = false;
			if(result)			
			System.out.printf("arr3[%d] = %d\n", i, arr3[i]);
		}
		
		
		
		
	}

}

package com.jcp.day3;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// i = 1 부터 입력한 n까지 합계를 구한다
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 0;	
		
		System.out.println("마지막 n값을 입력하세요. >>> ");
		
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			sum += i;
			System.out.println(" i =  " + i + ", sum = " + sum);
		}
		System.out.println("1 ~ " + n + " 까지의 합계는 " + sum + " 입니다.");
		
		// System.out.println("[[옵션]]1:짝수   2:홀수   3:기본(모든값)");
		//  --> for문보다는 while 문이 적합.
		int i2, n2, option, sum2 = 0;
		boolean run = true;
		while(run) {		
		System.out.println("마지막 n값을 입력하세요. >>> ");
		n2 = sc.nextInt();
		System.out.println("옵션을 선택하세요 1:짝수 2:홀수 3:기본 4:종료");
		option = sc.nextInt();
		switch(option) {
		case 1:
			for(i2 = 1; i2 <= n2; i2++) {
				if(i2 % 2 == 1) continue;
				else sum2 += i2;
				System.out.println(" i2 =  " + i2 + ", sum2 = " + sum2);
			}
			break;
		case 2:
			for(i2 = 1; i2 <= n2; i2++) {
				if(i2 % 2 == 0) continue;
				else sum2 += i2;
				System.out.println(" i2 =  " + i2 + ", sum2 = " + sum2);
			}
			break;
		case 3:
			for(i2 = 1; i2 <= n2; i2++) {
				sum2 += i2;
				System.out.println(" i2 =  " + i2 + ", sum2 = " + sum2);
			}
			break;
		case 4:
			System.out.println("종료합니다");
			run = false;
			break;
		default :
			System.out.println("잘못된 선택입니다");
			break;
				
			}
				
		}
		
		
		
		
	}

}

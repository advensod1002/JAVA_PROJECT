package com.jcp.day13;

import java.util.Scanner;

public class MySolution1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num, result, sum = 0;
		
		System.out.print("정수 1개 입력 >>> ");
		num = sc.nextInt();
		
		do {
			result = num % 10;
			sum += result;
			num /= 10;
			sb.append(result);
			if(num == 0)
				sb.append(" = ");
			else sb.append(" + ");
		}while(num != 0);
		System.out.println("실행결과  " + sb + sum);
		sc.close();
	}

}

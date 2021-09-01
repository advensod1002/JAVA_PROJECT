package test;
/*
  	처리조건
	1) int 배열의 크기를 20으로 합니다.
	2) 배열의 값은 11~99 사이의 난수를 생성하여 저장합니다.
	3) 저장된 배열의 값 중에서 소수를 검사합니다.
	4) 소수가 7개가 생성될 때 까지 반복합니다
	5) 4번의 결과를 출력합니다.
 */

import java.util.ArrayList;

public class Test {
	
	private static final int MAX_SIZE = 10;
	private static final int MAX_PRIME = 3;
	
	public static void main(String[] args) {		
		
		ArrayList<Integer> data = new ArrayList<>();
		ArrayList<Integer> prime = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		
		int cnt = 0;
		while(true) {
			int num = (int)(Math.random() * 56 + 5);
			if(isPrime(num) && !prime.contains(num)) {
				data.add(num);
				prime.add(num);
				cnt++;
			}else data.add(num);
			if(data.size() == MAX_SIZE) {
				if(cnt == MAX_PRIME) {
					break;
				}else {
					data.clear();
					prime.clear();
					cnt = 0;
				}
			}
			
		}
		System.out.println("전체 배열");
		System.out.println(data);
		System.out.println("소수 배열");
		System.out.println(prime);
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : " + (endTime-startTime)  +" ms 소요되었습니다.");
	}	// main
	
	static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if( num % i == 0) return false;
            }
        return true;
        }
}
				
		
	
	



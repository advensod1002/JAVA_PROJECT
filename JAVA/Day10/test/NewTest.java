package test;

import java.util.ArrayList;

public class NewTest {
	
	private static final int MAX_SIZE = 20;
	private static final int MAX_ODDCNT = 7;

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> testArr = new ArrayList<>();
		ArrayList<Integer> oddArr = new ArrayList<>();
		
		int oddCnt = 0;
		while(true) {
			int num = (int)(Math.random() * 89 + 11);
			// 소수이고 중복이 없을 떄 배열 추가 및 oddCnt++
			if(isPrime(num) && !oddArr.contains(num)) {
				testArr.add(num);
				oddArr.add(num);
				oddCnt++;
			}else	// 소수가 아닌값도 배열에 추가 
				testArr.add(num);
			// 배열의 인자가 20개가 되었을 때 조건 확인
			if(testArr.size() == MAX_SIZE) {
				if(oddCnt == MAX_ODDCNT) {
					break;
				}else {
					testArr.clear();
					oddArr.clear();
					oddCnt = 0;
				}
			}
		}	// while end
		
		System.out.print("테스트 배열 : ");
		System.out.println(testArr);
		
		System.out.print("소수 배열 : ");
		System.out.println(oddArr);
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : " + (endTime-startTime)  +" ms 소요되었습니다.");
	}
	
	static boolean isPrime(int num) {
	        for(int i = 2; i <= Math.sqrt(num); i++) {
	            if( num % i == 0) return false;
	            }
	        return true;
	        }
	
	}

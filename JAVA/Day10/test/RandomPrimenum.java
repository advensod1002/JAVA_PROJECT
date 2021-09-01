package test;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimenum {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int[] datas = new int[20];
		int[] primenums = new int[20];		//소수여부 표시
		int cnt=0;
		while(cnt!=3) {
			cnt=0;
			
			for (int i=0;i<20;i++)  {
				datas[i]=(int)(Math.random()*100 - 0.5);
			}
			
			System.out.print(Arrays.toString(datas));   //배열 20개 값 확인 출력
			for(int i=0;i<datas.length;i++) {
				boolean result=true;
				for (int k=2;k<=datas[i]/2;k++) {
					if(datas[i] % k ==0) {
						result=false; break;	
					}	
				}	
				
				if(result) {  cnt++; primenums[i]=1; }
				else primenums[i]=0;
			} //배열 값 검사 끝
			System.out.println( ":::" + cnt);			//소수 갯수 확인 출력
		}//while 끝
		
		//while 종료 . 배열의 소수갯수가 7개일 때
		for (int i=0;i<datas.length;i++)
			System.out.print(datas[i] + " = " + primenums[i] + " ");
		
		long endTime = System.currentTimeMillis();
		System.out.println("실행시간 : " + (endTime-startTime)  +" ms 소요되었습니다.");
	}

}

package com.jcp.day10;

import java.util.ArrayList;

//ArrayList 활용한 45개중 6개 랜덤 뽑기 : 확률을 1/45 -> 1/44 ....
public class LottoFinal {
	public static void main(String[] args) {
		
			int j, t, cnt = 45;
			double temp;
		
			ArrayList<Integer> lotto = new ArrayList<>();
			ArrayList<Integer> balls = new ArrayList<>();
			
			for(int i = 1; i <= 45; i++)
				balls.add(i);			
			// 6번 랜덤값 뽑기
			for(int i = 0; i < 6; i++) {
				temp = Math.random() * cnt;	// 랜덤값을 뽑아서 리스트의 인덱스로 사용 
				j = (int)Math.round(temp - 0.5);	// 랜덤값의 범위
				
				t = balls.get(j);
				lotto.add(t);
				balls.remove(j);			// balls 리스트에서 뽑힌 인덱스 삭제하기
				
				System.out.println("뽑은 공번호 : " + lotto);
				System.out.println("남은 공번호 : " + balls);
				cnt--;
			}
			System.out.println("::: 최종번호 :::");
			lotto.sort(null);
			System.out.println(lotto);
			
			
	}

}

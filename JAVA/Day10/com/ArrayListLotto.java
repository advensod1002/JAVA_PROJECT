package com.jcp.day10;

import java.util.ArrayList;

public class ArrayListLotto {
	public static void main(String[] args) {
		// TODO : 1~45 사이의 정수값을 랜덤으로 6개를 배열에 저장한다. 단, 중복된 값은 허용하지 않는다.
		
			ArrayList<Integer> lotto = new ArrayList<>();
			int test, j;
			for(int i = 0; i < 6; i++) {

				do {
					double temp = Math.random() * 45 +1; 
					test = (int)Math.round(temp - 0.5);
			
					//중복된 값은 출력 안하기
					for(j = 0; j < i; j++) {      
						if(test == lotto.get(j)) {  
							System.out.print("*");
							break;		
						}	      
					}
					
				}while(i!=j);   
				
				lotto.add(test);    
				
			}//for i - end
		System.out.println("\n--- 생성된 6개 랜덤값(난수) 출력 ---");
		System.out.print(lotto);
		}
	}
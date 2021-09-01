package com.jcp.day13;

import java.util.Arrays;

public class MySolution {
	
	private static final int MAX_SIZE = 10;

	public static void main(String[] args) {		
		
		int[] nums = new int[MAX_SIZE];
		int[] isprime = new int[MAX_SIZE];	
		int cnt = 0;
		
		while(cnt != 3) {
			cnt = 0;
			for (int i = 0; i < MAX_SIZE; i++)  {
				nums[i] = (int)(Math.random() * 56 + 5);
			}
			for(int i = 0; i < MAX_SIZE; i++) {
				boolean result = true;
				for (int k = 2; k <= nums[i] / 2; k++) {
					if(nums[i] % k == 0) {
						result = false; 
						break;	
					}	
				}					
				if(result) {
					cnt++; 
					isprime[i] = 1; 
					}else 
						isprime[i]=0;
				}
		}
		System.out.println(Arrays.toString(nums));
		for (int i=0;i<MAX_SIZE;i++) {
			if(isprime[i] == 1) {
				System.out.println(nums[i] + "소수");
			}else
				System.out.println(nums[i]);
		}
		
	}

}

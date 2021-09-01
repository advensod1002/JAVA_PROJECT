package com.jcp.day13;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{

	private static final int PLUS_LIMIT = 1000000;
	
	public KakaoVIP(String owner) {
		super(owner);
	}

	@Override
	public int upLimit(int plus) {
		if(plus <= PLUS_LIMIT) { 
			limit += plus;
			return plus;
		}else {
			limit += PLUS_LIMIT;
			return PLUS_LIMIT;
		}
	}
	
	@Override
	public int pay(int money) {
		if(money + payTotal > limit)
		return 0;
		else {
			payTotal += money;
			return money;
		}
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###");	
		// 정수 또는 실수에 출력패턴을 설정
		// 정수값 limit을 long으로 변환해서 패턴을 적용하고 문자열로 리턴
		return owner + " 님 이번달 결제 예정 금액 " + df.format(payTotal) + " 원 입니다. [이용한도 " + df.format(limit) + " 원]" ;
	}
}
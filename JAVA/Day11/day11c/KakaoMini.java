package day11c;

import java.text.DecimalFormat;

/*
 * 1) 이용한도 금액의 최대값 상수 MAX_LIMIT 을 선언하여 초기값을 10만으로 합니다.
 * 2) 생성자 : 상위클래스의 생성자를 호출하여 실행합니다.
 * 3) 추상메소드 구현 : upLimit , pay 은 아래 실행결과를 참고하여 구현합니다.
 * 4) 재정의 메소드 toString :  3개의 필드값을 문자열로 리턴.
 * KakaoMini  클래스의 추상메소드 정의
 * 1. upLimit : limit+plus 가 MAX_LIMIT을 초과하지 못하도록 한다. 초과하면 0을 리턴 초과하지 않으면 limit을 plus만큼 더하고 plus를 리턴합니다.
 * 2. pay : money 가 결제 금액입니다. money를 결제했을때 limit 를 초과하지 못하도록 합니다.
 * money+payTotal 이 limit 보다 크면 0을 리턴 초과하지않으면 money 금액 결제를 처리하여 payTotla에 더하고 money를 리턴합니다.
*/

public class KakaoMini extends CreditCard{

	private static final int MAX_LIMIT = 100000;
	
	
	public KakaoMini(String owner) {
		super(owner);
	}

	@Override
	public int upLimit(int plus) {
		if(limit + plus > MAX_LIMIT) 
			return 0;
		else {
			limit += plus;
			return plus;
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

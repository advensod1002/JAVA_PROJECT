package day11c;

/*
 * 1. 추상클래스 CreditCard 를 아래와 같은 내용으로 만드세요. -> 신용카드 정보 클래스
 * 1)  필드 : 접근한정자 protected, 필드명 : String owner(소유자) 
 * , int limit(이용한도) , int payTotal (총이용금액)
 * 메소드 접근한정자는 모두 public  으로 합니다.
 * 2) 생성자 : owner 필드값을 초기화하는 커스텀 생성자
 * 3) 인스턴스 메소드 :  필드값 접근을 위한 getter, setter 메소드
 * 4) 추상 메소드 :  int upLimit(int plus)
*/  

public abstract class CreditCard {
	
	protected String owner;
	protected int limit;
	protected int payTotal;
	
	public CreditCard(String owner) {
		this.owner = owner;		
	}
	
	public abstract int upLimit(int plus);
	public abstract int pay(int money);
	
	
	public String getOwner() {
		return owner;
	}

	public int getLimit() {
		return limit;
	}


	public int getPayTotal() {
		return payTotal;
	}

	
}

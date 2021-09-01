package day11b;

public class SmartTVTest {

	public static void main(String[] args) {
		
		// 2개의 인터페이스를 구현한 SmartTV 클래스를 테스트
		
		// 인터페이스 타입으로 객체를 참조
		RemoteControl rc = new SmartTV();
		// rc.search("");	// 오류 인터페이스 타입 불일치
		workVolume(rc);		// 인터페이스 타입 인자로 메소드 실행
		
		// workSearch(rc); 오류 인자 타입이 불일치
		WebSearch ws = (WebSearch) rc;	// 인터페이스 타입 변경
		
		workSearch(ws);
		
		System.out.println("메소드 인자에 직접 객체 전달하기");
		// SmartTV 클래스가 2개 인터페이스 구현 클래스이므로 가능
		workVolume(new SmartTV());
		workSearch(new SmartTV());
		
	}
	
	// 아래의 메소드 2개는 테스트를 위해서 인터페이스 타입 인자를 갖도록 만듬
	// 볼륨을 동작시키는 메소드 인자 RemoteControl 타입
	public static void workVolume(RemoteControl rc) {	// 다형성
		rc.setVolume(12);
	}
	
	// 검색을 동작하는 메소드 인자 WebSearch 타입
	public static void workSearch(WebSearch ws) {		// 다형성
		ws.search("http://www.naver.com");
	}
	/* 
	 * SmartTV 클래스는 RemotControl, WebSearch, SmarTV 타입으로 참조할수 있고
	 * Audio 클래스는 RemoteControl, Audio 타입으로 참조하여 이 중 선택하여
	 * 메소드 인자, 리턴타입, 변수 타입 설정에 사용합니다
	 */
}

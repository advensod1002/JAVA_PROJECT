package day12a;

// 추상 클래스는 상속하는 하위 클래스가 있고 인터페이스는 구현 클래스를 사용
// 공통점은 추상메소드를 갖는다 -> 익명 클래스는 임시로 사용할 때 활용
public class Test {

	public static void main(String[] args) {
		// InterdaceA 를 익명 클래스 구현으로 객체 생성 -> 스레드 프로그래밍에서 주로 사용
		InterfaceA ifa = new InterfaceA() {		// 임시로 한번만 사용할 인터페이스 구현체
			
			@Override
			public int methodB(int num) {	
				// TODO Auto-generated method stub
				return 12;
			}
			
			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				
			}
		};
		
		System.out.println(ifa.methodB(20));

	}

}

package day12a;

public class Test2 {
	
	InterfaceA ifa;			// 필드 타입으로 인터페이스 사용
	InterfaceA[] ifas = new InterfaceA[10];
	// 참조값 저장할 배열 크기를 선언. 인터페이스 타입으로 사용
	
	void test() {
		ifas[0] = new MyClassA();
	}

}

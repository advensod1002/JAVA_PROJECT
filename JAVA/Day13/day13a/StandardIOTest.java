package day13a;

import java.io.IOException;

// 표준 입출력 간단하게 테스트
public class StandardIOTest {
	
	public static void main(String[] args) {
		
		int b;
		
		System.out.println("저장할 내용을 입력하세요");
		
		try {
			b = System.in.read();
			// 입력한 문자(아스키코드값)를 정수로 리턴 입력스트림에서 읽어올 것 없으면 -1 리턴
			// read 메소드는 Exception 가능성이 있으므로 try catch 필요
			System.out.println(b);
			
			// 엔터는 아스키코드 13 + 10의 결합 \\r\\n
			b = System.in.read();	// 13
			System.out.println(b);
			
			b = System.in.read();	// 10
			System.out.println(b);
			
		} catch (IOException e) {
			System.out.println("입력 오류 : " + e.getMessage());
			e.printStackTrace();	// 오류내용 확인
		}	
		
	}

}

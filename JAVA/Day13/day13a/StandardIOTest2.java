package day13a;

import java.io.IOException;

// 표준 입출력 반복 테스트
//표준입력 -> 프로그램 -> 표준출력
public class StandardIOTest2 {
	
	public static void main(String[] args) {
		
		int b, count = 0;
		
		System.out.println("저장할 내용을 입력하세요");
		
		// 유니코드 : utf-8 3 바이트
		// 자바 char 2바이트 : 한글, 연문, 기호 모두 2바이트 저장
		try {
			while((b = System.in.read()) != -1){
				// 버퍼에서 가져올떄에는 입력한 문자를 utf-8 인코딩으로 한글 3바이트 아스키 코드 1바이트
				count++;
				System.out.write(b);
				// System.out.print(b);
				// System.out.print((char)b); 문자인코딩 못함
			}
			System.out.println("::: " + count + " 바이트 입력! :::");
			
		} catch (IOException e) {
			System.out.println("입력 오류 : " + e.getMessage());
			e.printStackTrace();	// 오류내용 확인
		}	
		
	}

}

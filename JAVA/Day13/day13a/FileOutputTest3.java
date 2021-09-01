package day13a;

import java.io.FileOutputStream;
import java.io.IOException;

// 표준 입출력 반복 테스트
// 표준입력 -> 프로그램 -> 파일 시스템 출력(바탕화면의 test.txt)
public class FileOutputTest3 {
	
	public static void main(String[] args) {
		
		int b, count = 0;
		
		System.out.println("저장할 내용을 입력하세요");
		try {
			// FileOutputStream 클래스 생성자 - FileNotFoundException 처리가 필요
			//									ㄴ IOException의 하위 클래스
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test.txt");
			
			while((b = System.in.read()) != -1){
				count++;
				fos.write(b);
			}
			System.out.println("::: " + count + " 바이트 입력! :::");
			fos.close();
			
		} catch (IOException e) {
			System.out.println("입력 오류 : " + e.getMessage());
			e.printStackTrace();	// 오류내용 확인
		}	
	}

}

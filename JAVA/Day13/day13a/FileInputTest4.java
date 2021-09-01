package day13a;

import java.io.FileInputStream;
import java.io.IOException;

// 표준 입출력 반복 테스트
// 파일시스템(바탕화면) -> 프로그램 -> 표준출력
public class FileInputTest4 {
	
	public static void main(String[] args) {
		
		int b, count = 0;
		
		System.out.println("파일에서 입력받은 내용을 출력");
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\prob1.txt");
			// 파일이 바탕화면에 없으면 FileNoetFoundException 발생
			while((b = fis.read()) != -1){	// 입력스트림을 파일로 변경
				count++;
				System.out.write(b);
			}
			System.out.println("::: " + count + " 바이트 입력! :::");
			fis.close();
			
		} catch (IOException e) {
			System.out.println("입력 오류 : " + e.getMessage());
			e.printStackTrace();	// 오류내용 확인
		}	
		
	}

}

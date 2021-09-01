package day13a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 표준 입출력 반복 테스트
// 파일시스템(바탕화면) -> 프로그램 -> 표준출력
public class FileIOTest5 {
	
	public static void main(String[] args) {
		System.out.println("작성자 : 김범진 - 실행시간 테스트 합니다.");
		int b, count = 0;
		byte[] buf = new byte[1024];
		
		long start = System.currentTimeMillis();
		long end;
		System.out.println("바탕화면에 java.jpg 파일을 다운로드 경로로 [바이트 단위로] 복사합니다");
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\java.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\KimBeomJin\\Downloads\\java.jpg");
			while((b = fis.read()) != -1){	// 입력스트림을 파일로 변경
			//while((b = fis.read(buf)) != -1) {	
				count++;
				fos.write(b); // 콘솔 출력
				 //fos.write(buf, 0, b);
			}
			System.out.println("::: " + count + " 바이트 복사! :::");
			System.out.println("바탕화면에 java.jpg 파일을 다운로드 경로로 [바이트 단위로] 복사완료");
			end = System.currentTimeMillis();
			System.out.println("실행시간 : " + (end - start) + " ms 소요\n\n");
			fos.close();
			fis.close();
			
			fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\java.jpg");
			fos = new FileOutputStream("C:\\Users\\KimBeomJin\\Downloads\\java2.jpg");
			start = System.currentTimeMillis();
			System.out.println("바탕화면에 java.jpg 파일을 다운로드 경로로 [1024 바이트 buf 크기 단위로] 복사합니다");
			count = 0;
			while((b = fis.read(buf)) != -1){
				count += b;
				fos.write(buf, 0, b);
			}			
			System.out.println("::: " + count + " 바이트 복사! :::");
			System.out.println("바탕화면에 java.jpg 파일을 다운로드 경로로[1024 바이트 buf 크기 단위] 복사완료");
			end = System.currentTimeMillis();
			System.out.println("실행시간 : " + (end - start) + " ms 소요\n\n");
			
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {	// 자실(하위)타입을 먼저 검사 순서가 바뀌면 컴파일 오류 발생
			System.out.println("선택한 파일과 경로명이 잘못되었습니다." + e.getMessage());
		} catch (IOException e) {
			System.out.println("입력 오류 : " + e.getMessage());
			e.printStackTrace();	// 오류내용 확인
		}
	}
}

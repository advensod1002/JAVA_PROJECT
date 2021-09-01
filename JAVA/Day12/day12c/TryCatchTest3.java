package day12c;

import java.util.InputMismatchException;
import java.util.Scanner;

//TryCatchTest2.java 에서 데이터 입력을 추가합니다
public class TryCatchTest3 {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String message = null;   
		boolean result = false ;
		
		System.out.print("메시지 입력하세요 >>> ");
		message = sc.nextLine();
		
		try {
			
			result = message.equals("hello");
			
			if(result) System.out.println("원하는 메시지 입니다.");
			else System.out.println("보고싶은 메시지가 아닙니다.");
			
			System.out.print("정수 입력하세요 >>> ");
			int num = sc.nextInt();		// try 블럭의 지역변수
			System.out.println("입력데이터 num = " + num);		// 사용자가 숫자만 입력해야 정상 실행
		
		}catch (NullPointerException e) {   
			System.out.println("exception 이 발생했습니다. - " + e.getMessage());
			// e.ptintStackTrace(); -> 오류의 원인을 추적하고 출력
			
		}catch (InputMismatchException e) {
			System.out.println("문자열은 nextInt() 로 정수변환을 못합니다." + e.getMessage());
		}finally {
			// try 또는 catch 모두 마지막에 실행 return이 있는 메소드에서 try catch 사용할떄
			//							return(메소드 종료) 전에 실행
			System.out.println("끝");
		}
		sc.close();
	}
}

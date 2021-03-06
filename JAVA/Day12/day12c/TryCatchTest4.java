package day12c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest4 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] menu = {"삼겹살", "스파게티", "곱창전골", "불고기", "탕수육"};
		int sel;
		
		System.out.println("메뉴 번호 입력하세요 ");
		for(int i = 0; i < menu.length; i++) {
			System.out.println("[" + (i + 1) + "]" + menu[i]);
		}		
		
		// 여기서 발생할 수 있는 Exception 2가지를 try ~ catch 로 수정해 보세요
		try {
			System.out.print("선택 >>> ");
			sel = sc.nextInt();		// 배열의 인덱스
			System.out.println("당신이 선택한 메뉴는 " + menu[sel - 1] + " 입니다.");
		
			// catch(XXXX e) 는 try 안에서 발생한 XXXXException 객체 e를 검사
		}catch (ArrayIndexOutOfBoundsException e) {   
			System.out.println("없는 메뉴 번호 입니다");
		}catch (InputMismatchException e) {
			System.out.println("메뉴 선택은 숫자 1 ~ 5 만 해주세요");
		}finally {
			sc.close();
			System.out.println("끝");
		}
	}
}

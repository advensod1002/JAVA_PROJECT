package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class WordTest {

	public static void main(String[] args) {
		
		String fname = "C:\\Users\\Administrator\\Desktop\\WordTest.txt";
		File file = new File(fname);	
		Scanner sc = new Scanner(System.in);
		List<Word> word = new ArrayList<>();
		List<Word> word2 = new ArrayList<>();
		int menu;
		String english, koreans;
		boolean run = true;
		while(run) {
		System.out.println("[메뉴]");
		System.out.println("1. 새로운 단어 추가하기 \n2. 조회하기 \n3. 파일저장하기 \n4. 종료 ");
		System.out.print("메뉴를 선택하세요 >>> ");
		menu = sc.nextInt();		
		switch(menu) {
		case 1 :
			System.out.print("영어 단어 입력 >>> ");
			english = sc.next();
			System.out.print("한글 단어 입력 >>> ");
			koreans = sc.next();
			word.add(new Word(english, koreans));
			try {
				PrintWriter fpw = new PrintWriter(file);
				for(Word w : word) {
					fpw.println(w);	
				}
				fpw.close();
				System.out.println("새로운 단어가 추가 되었습니다.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
			
		case 2 :
			try {
				Scanner fsc = new Scanner(file);
				Word w = null;
				while(fsc.hasNext()) {
					String temp = fsc.nextLine();
					StringTokenizer stk = new StringTokenizer(temp);
					while(stk.hasMoreTokens()) {
						w = new Word(stk.nextToken(), stk.nextToken());
						}
					System.out.println(w);
					}
				fsc.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					}
			break;
			
		case 3 :
			
			try {
				PrintWriter fpw = new PrintWriter(file);   //File 객체로 출력할 파일 지정합니다.
				for(Word w : word) {
					fpw.println(w);
				}
				fpw.close();
				System.out.println("파일 저장이 완료되었습니다.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
			
		case 4:
			System.out.println("종료합니다.");
			run = false;
			break;
			
		default:
			System.out.println("없는 메뉴입니다 다시 선택해주세요.");
			break;
			}
		}
		sc.close();
	}
}
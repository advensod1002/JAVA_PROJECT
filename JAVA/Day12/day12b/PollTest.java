package day12b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 간단한 Map 예제 : 오늘 저녁메뉴를 설문조사 -> 선택할때마다 값이 1증가 
public class PollTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String menu = "오늘의 메뉴 : 삼겹살, 불고기, 떡볶이, 스파게티, 곱창전골";
		String ans = null;
		Map<String, Integer> map = new HashMap<>();	// 한꺼번에 import 단축기 : ctrl+shift+o
		// 메뉴의 선택 표수를 초기화
		map.put("삼겹살", 0);
		map.put("스파게티", 0);
		map.put("불고기", 0);
		map.put("곱창전골", 0);
		map.put("떡볶이", 0);
		
		while(true) {
			System.out.println(menu);
			System.out.println("프로그램 종료는 end 입력하세요.");
			System.out.print("저녁 메뉴 설문조사 중입니다. 선택 >>> ");
			ans = sc.nextLine();
			if(ans.equals("end")) break;
			
			// 1) 사용자가 없는 메뉴(key) 입력하면 없다고 다시 선택하라고 알려주기
			// 2) 입력한 메뉴의 value 값 + 1 증가하여 저장
			if(map.containsKey(ans)) { // map에 입력한 key ans 값이 있는지 검사
				int result = map.get(ans);
				map.put(ans, ++result);
				System.out.println("확인 : " + map.get(ans));
				
			}else {
				System.out.println("없는 메뉴 입니다. 메뉴에 추가합니다");
				map.put(ans,  1);
				menu += ", " + ans;
			}
		}
		
		System.out.println(map);		
		// 모든 클래스는 Object를 상속받아 toString() 재정의 하여 출력 내용을 바꿀수 있음 	
		// {스파게티=0, 곱창전골=0, 불고기=0, 삼겹살=0, 떡볶이=0} -> 순서가 없는 구조
		System.out.println("끝");
	}

}

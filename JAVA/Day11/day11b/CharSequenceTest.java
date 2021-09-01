package day11b;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// 자바 API 클래스의 인터페이스 활용 테스트
// CharSequence 인터페이스
public class CharSequenceTest {

	public static void main(String[] args) {
		
		String result = "";
		for(int i = 2; i < 5; i++) {
			result += i + "/";		// result 문자열에 I, "/" 연결하기
			System.out.println(result);
			/*
			 * 2/		-> 다른 문자열에 대해 매번 새로운 String 객체를 만들어 저장 
			 * 2/3/ 	ㄴ String 클래스 문제점 : 새로운 문자열을 위해 메모리 사용과 해제에 대한 관리필요
			 * 2/3/4/
			 */
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i < 5; i++) {
			sb.append(i).append(",");	// 문자열의 내용이 바뀌어도 객체가 유지되면서 추가 또는 삭제 등의 변경
			System.out.println(sb);		// 		ㄴ 빈번하게 문자열의 내용이 바뀔때 효율적으로 사용
		}
		
		StringBuffer sf = new StringBuffer(); 
		// StringBuilder 와 같은 장점, and 멀티스레드에서 사용
		
		// CharSequnce  인터페이스를 구현 클래스는 String StringBuffer StringBuilder
		String temp = "1,2,3,4,5";
		System.out.println(temp.contains(result));	// 인자가 String
		System.out.println(temp.contains(sb));		// 인자가 StringBulider
													// ㄴ contains 메소드 인자는 CharSequnce 인터페이스 타입
		
		List<String> list = new ArrayList<String>();	// ArrayList 참조변수 선언형식 인터페이스 타입으로 함
		List<String> vector = new Vector<String>();		// 운반하는 ArrayList와 동일한 동작 and 멀티스레드 구현
		
		list.add("abc");
		vector.add("xyz");
		
	}

}

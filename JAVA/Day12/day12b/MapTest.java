package day12b;

import java.util.HashMap;
import java.util.Map;

// Map<K, V> 인터페이스 구현체 HashMap<K, V> 클래스 연습
// K - Key 데이터 타입, V - Value 데이터 타입 (K 와 V 는 기본 데이터 타입과 클래스 타입 모두 가능)
public class MapTest {					// ㄴ 기본 데이터 타입도 Wrapper 클래스 타입으로 함
										//		ㄴ Integer, Long, Double, Float...
	public static void main(String[] args) {
		// 지금까지의 데이터 저장하는 자료구조 : 배열, ArrayList -> 인젝스를 갖고 순차적으로 접근하는 방식
		
		// 데이터 저장하는 자료구조 중읜 하나로 Map 타입을 사용 -> 키(key) 값으로 접근하는 방식 인덱스가 없습니다
		Map<String, Integer> map = new HashMap<>();
		
		// 데이터를 저장
		map.put("삼겹살", 10000);
		map.put("스파게티", 9000);
		map.put("불고기", 13000);
		map.put("곱창전골", 20000);
		map.put("떡볶이", 5500);
		
		// 값을 가져오기 - 순차적 접근이 아니므로 반복문과 사용하는 경우는 거의 없음
		System.out.println("KEY : 삼겹살의 값 - " + map.get("삼겹살"));	// 값 가져오기 -> Key 지정
		System.out.println("KEY : 치킨의 값 - " + map.get("치킨"));	// 값 가져오기 -> Key 지정
		String key = "불고기";
		int value = map.get(key);
		System.out.println("KEY : " + key + " 의 값 - " + value );
		map.put("삼겹살", 11000);		// 키 값이 같은것이 있으면 데이터(value)가 수정됨
	}

}

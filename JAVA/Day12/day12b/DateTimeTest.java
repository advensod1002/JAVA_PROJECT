package day12b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// 날짜와 시간 형식 클래스 연습
// java.util.Date 클래스 -> java.util.Caledar 클래스 
// 		-> Java 8버전 LocaDate(날짜) LocalTime(시간) LocalDateTime(날짜와 시간)
public class DateTimeTest {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();	// 현재 날짜
		System.out.println("날짜 확인 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인 : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("널쩌 와 시간 확인 : " + current);
		
		LocalDate wdate = LocalDate.of(2021, 1, 12);
		System.out.println("날짜 확인 : " + wdate);
		
		LocalTime wtime = LocalTime.of(23, 11);
		System.out.println("시간 확인 : " + wtime);
		
		// 현재 날짜로 부터 10일 후를 계산
		System.out.println("오늘 날짜 + 10일 : " + currentDate.plusDays(10));
		System.out.println("오늘 날짜 - 10일 : " + currentDate.minusDays(10));
		
	}

}

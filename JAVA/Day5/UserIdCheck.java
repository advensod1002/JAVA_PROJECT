package com.jcp.day5;

import java.util.Scanner;

public class UserIdCheck {

	public static void main(String[] args) {
		/*
		 * 요구사항:회원가입할 때 아이디가 사용가능한지 다음 조건으로 검사합니다.
		 * 1. 문자의 갯수는 6개 이상으로 정합니다.
		 * 2. 시작문자가 숫자이면 안됩니다.
		 * 3. 특수문자 중에 @를 포함하면 안됩니다.
		 * 
		 * [실행화면]
		 * 회원가입을 환영합니다. 
		 * 1. 아이디는 6글자 이상이고 숫자로 시작할수 없습니다.
		 * 2. 특수문자 @는 사용할수 없습니다.
		 * -----------------------------------------
		 * 사용할 아이디를 입력하세요. >>> xo88
		 * 입력한 아이디를 검사합니다............
		 * 사용할수 없는 아이디입니다. - 아이디를 6글자 이상해주세요.
		 * 메시지는  또는 사용할수 없는 아이디입니다. - 아이디는 숫자로 시작할수 없습니다.
		 * 또는 사용할수 없는 아이디입니다. - @ 기호를 사용할 수 없습니다.
		 */
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		String id, message= null;
		char ch;
		
		//1. 메시지 표시
		System.out.println("회원가입을 환영합니다");
		System.out.println("1. 아이디는 6글자 이상이고 숫자로 시작할수 없습니다.");
		System.out.println("2. 특수문자 @ 는 사용할수 없습니다.");
		System.out.println("--------------------------------------");
		//2. 사용자 아이디 입력
		System.out.print("사용할 아이디를 입력하세요. >>> ");
		id = sc.nextLine();
		System.out.println("입력한 아이디를 검사합니다............");
		//3. 입력받은 아이디 6글자 이상인지 검사
		if(id.length() < 6) {   //6글자 미만이면 result를 false로
			result = false;			
			message = "아이디를 6글자 이상해주세요.";
		}else{  //6글자 이면			
			ch = id.charAt(0);
			if(ch >= '0' && ch <= '9') {  //첫글자가 숫자인지 - result를 false로
				result = false;
				message = "아이디는 숫자로 시작할수 없습니다.";
			}else {
				//특수문자 '@' 있는지 - result를 false로
				//방금한 반복문으로 검사합니다
				for(int i = 0; i < id.length(); i++) {
					ch = id.charAt(i);
					if(ch == '@') { 
						result = false;
						message = " @기호를 사용할 수 없습니다";
						break;
						}
					}
				}
			}	
		//출력 - result 가 true일때 , false 일때 다르게 메시지를 표시
		if(result == true) System.out.println("사용할 수 있는 아이디입니다.");
		else System.out.println("사용할 수 없는 아이디입니다. " + message);
		sc.close();
		}	
	} 
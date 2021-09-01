package com.jcp.day9b;

import java.util.Scanner;

public class AnimalCommunity2 {

	public static void main(String[] args) {
		
		int num, age;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("환영합니다!");
		System.out.println("회원정보를 입력하세요.");
		
		System.out.print("사용자의 이름을 입력하세요 >>> ");
		name = sc.next();
		
		System.out.print("사용자의 나이를 입력하세요 >>> ");
		age = sc.nextInt();
		
		System.out.println("[반려동물 목록을 보여드리겠습니다.]");
		
		
		Animal[] animals = new Animal[10]; 
		Member user = new Member(name, age);
		
		animals[0] = new Puppy("브라운");
		animals[1] = new Cat();
		animals[1].setColor("그레이");
		animals[2] = new Rabbit();		
		animals[2].setColor("화이트");
		
		// 익명클래스(Anonymous) - 이름이 없는 클래스
		animals[3] = new Animal() {		// Inner : 클래스 안에서 클래스를 정의
			
			//추상메소드 구현이 필요합니다
			@Override
			public void sound() {
				System.out.println(this.getColor() + " 쥐는 🐭🐭 찍찍하고 울어댑니다.");
			}

			@Override
			public String getType() {
				// TODO Auto-generated method stub
				return "쥐";
			}
		};
		animals[3].setColor("다크그레이");
		
		animals[4] = new Animal("칼라풀") {		// Inner : 클래스 안에서 클래스를 정의
			@Override
			public void sound() {
				System.out.println(this.getColor() + " 앵무새는  🐦🐦는 안녕~ 하고 말합니다.");
			}
			
			@Override
			public String getType() {
				return "앵무새";
			}
		};
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null) {
				System.out.print("[" + (i + 1) + "] ");
				animals[i].sound();
			}
		}
		
		System.out.print("분양할 동물을 선택하세요. >>> ");
		num = sc.nextInt();
		Animal temp = animals[num-1];
		boolean result = user.isADopt(animals[num-1]);
		String message = user.getName() + " 회원님은 ";
		if(temp instanceof Puppy)
			message += Puppy.TYPE;
		else if(temp instanceof Cat)
			message += Cat.TYPE;
		else if(temp instanceof Rabbit)
			message += Rabbit.TYPE;
		else if(temp instanceof Animal)
			message += temp.getType();
		print(result, message);
		sc.close();
		
	}// main end

	private static void print(boolean result, String message) {
		if(result == true) {
			System.out.print(message + " 분양이 가능합니다.");
			System.out.println("😀😀");
		}else {
			System.out.print(message + " 분양 자격이 안됩니다.");
			System.out.println("😓😓");
		}
	}
}
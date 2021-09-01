package com.jcp.day9b;

public class AnimalCommunity {

	public static void main(String[] args) {
		// Animal[] animals = new Animal[3];
		Animal[] animals = new Animal[10];
		animals[0] = new Puppy("브라운");
		// animals[0].setColor("브라운");

		animals[1] = new Cat();
		animals[1].setColor("그레이");
		
		animals[2] = new Rabbit();		
		animals[2].setColor("화이트");
		
		System.out.println("[반려동물 목록을 보여드리겠습니다.]");
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null)
			animals[i].sound();
			
		}
		
		// 모모회원이 동물 분양 받을 수 있는지 셀프체크
		// 강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.
		System.out.println("1)");
		Member momo = new Member("모모", 17);
		boolean result = momo.isADopt(animals[1]);
		String message = momo.getName() + " 회원님은 ";
		if(animals[1] instanceof Puppy)
			message += "강아지";
		else if(animals[1] instanceof Cat)
			message += "고양이";
		else if(animals[1] instanceof Rabbit)
			message += "토끼";
		print(result, message);
		
		System.out.println("2)");
		Member sana = new Member("사나", 16);
		result = sana.isADopt(animals[0]);
		message = sana.getName() + " 회원님은 " + animals[0].getType();
		print(result, message);
		
		System.out.println("3)");
		Member mina = new Member("미나", 20);
		result = mina.isADopt(animals[1]);
		message = mina.getName() + " 회원님은 ";
		if(animals[1] instanceof Puppy)
			message += Puppy.TYPE;
		else if(animals[1] instanceof Cat)
			message += Cat.TYPE;
		else if(animals[1] instanceof Rabbit)
			message += Rabbit.TYPE;
		print(result, message);
		
		// 결론 : 여러가지 방법 중에 다른 메소드(기능)을 고려해서 적합한 것으로 선택
		
		
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

package exam;

import java.util.Scanner;

public class MathTest2 {

	public static void main(String[] args) {
		
		MathClass math = new MathClass();
		Scanner sc = new Scanner(System.in);		
		
		for(int j = 0; j < 10; j++) {

			math.qustion();
			System.out.print("답 >>> ");
			math.i = sc.nextInt();
			
			math.print();
			}
		System.out.println("맞은 답 : " + math.count + " 개");
		sc.close();
	}
}
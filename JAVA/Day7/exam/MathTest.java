package exam;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		
		MathClass math = new MathClass();
		Scanner sc = new Scanner(System.in);
		
		math.qustion();
		System.out.print("답 >>> ");
		math.i = sc.nextInt();		
		
		math.print();
		
		sc.close();
	}
}
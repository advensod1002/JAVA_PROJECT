package mathexam;

import java.util.Scanner;

public class MathTest {
	
	static final int SIZE = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num1Array = new int[SIZE];
		int[] num2Array = new int[SIZE];
		int[] iArray = new int[SIZE];
		int count = 0;
		
		
		MathClass math = new MathClass(num1Array, num2Array, iArray);
		for(int j = 0; j < 10; j ++) {
			math.qustion();
			System.out.print("제출한 답 >>> ");
			iArray[j] = sc.nextInt();
			if(math.answer() == iArray[j]) {
				System.out.println("채점 : O");
				count++;
				}
			else System.out.println("채점 : X");
			System.out.println("정답 : " + math.answer());
			}
		
		System.out.println("맞은 답 : " + count + " 개");
		sc.close();
		}
			
	}




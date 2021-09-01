package exam;

import java.util.Scanner;

public class AddQuizTest {
	static final int COUNT = 5;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AddQuiz[] quiz = new AddQuiz[COUNT];
		int cnt = 0;
		
		// System.out.println((int)(Math.random()*89) + 11);
		System.out.println("덧셈 10문제 퀴즈를 시작합니다");
		for(int i =0; i < quiz.length; i++) {
			quiz[i] = new AddQuiz();
			quiz[i].data1 = (int)(Math.random()*89) + 11;
			quiz[i].data2 = (int)(Math.random()*89) + 11;
			System.out.println((i + 1) + "번 " + quiz[i].data1 + "+" + quiz[i].data2 + "= ?");
			System.out.println("답 입력하세요 >>> ");
			quiz[i].userAns = sc.nextInt();
			if(quiz[i].makeResult()) cnt++;
		}
		
		System.out.println("------------------ 채점하고있습니다 ------------------");
		System.out.println("\t문제\t제출한답\t정답\t채점");
		for(int i = 0; i < quiz.length; i++) {
			System.out.println((i + 1) + "번. \t" + quiz[i].data1 + "+" + quiz[i].data2 + "\t"
								+ quiz[i].userAns + "\t" + (quiz[i].data1 + quiz[i].data2) + "\t"
								+ quiz[i].resultPrint());
		}
		System.out.println("\n::: 맞은 개수 " + cnt + " 입니다 :::");
	}

}

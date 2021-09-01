package exam;

public class MathClass {
	
	int i, num1, num2, count = 0;
	
	int num1() {
		return num1 = (int) (Math.random() * 89) + 11;
	}
	
	int num2() {
		return num2 = (int) (Math.random() * 89) + 11;
	}
	
	void qustion() {
		System.out.printf("%d + %d = ?\n", num1(), num2());
	}
	
	int answer() {
		return num1 + num2;
	}	

	void print() {
		if(answer() == i) {
			System.out.println("채점 : O");
			count++;
			}
		else System.out.println("채점 : X");
		System.out.println("정답 : " + answer());
		}
	}
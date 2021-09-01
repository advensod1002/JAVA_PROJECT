package mathexam;

import java.util.Arrays;

public class MathClass {
	
	int i, num1, num2, count = 0;
	int[] num1Array;
	int[] num2Array;
	int[] iArray;
	
	
	public MathClass(int[] num1, int[] num2, int[] i) {
		this.num1Array = num1;
		this.num2Array = num2;
		this.iArray = i;	
	}	
	int num1() {
		int result = 0;
		for(int i = 0; i < num1Array.length; i++)
			result = num1Array[i] = (int) (Math.random() * 89) + 11;
		return result;
	}
	
	int num2() {
		int result = 0;
		for(int i = 0; i < num2Array.length; i++)
			result = num2Array[i] = (int) (Math.random() * 89) + 11;
		return result;
	}
	
	void qustion() {
		System.out.printf("%d + %d = ?\n", num1(), num2());
	}
	
	int answer() {
		int result = 0;
		for(int i = 0; i < num1Array.length; i++)
			result = num1Array[i] + num2Array[i];
		return result;
	}

	}
		
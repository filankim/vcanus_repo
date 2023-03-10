package com.vcanus.test03;

public class Factorial {
	
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	
	//재귀함수를 이용하여 Factorial 을 구하는 함수
	public static int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}

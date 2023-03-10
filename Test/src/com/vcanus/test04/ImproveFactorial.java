package com.vcanus.test04;

public class ImproveFactorial {

	public static void main(String[] args) {
		long result = factorial(1000000);
		System.out.println(result);
	}

	//재귀함수를 반복문으로 변경 - 스택오버플로우 방지 
	public static long factorial(long num) {
		long result = 1L;
		
		while (num != 0) {
			result *= num--;
		}
		
		return result;
	}

}

package com.vcanus.test04;

public class ImproveFactorial {

	public static void main(String[] args) {
		long result = factorial(1000000);
		System.out.println(result);
	}

	//����Լ��� �ݺ������� ���� - ���ÿ����÷ο� ���� 
	public static long factorial(long num) {
		long result = 1L;
		
		while (num != 0) {
			result *= num--;
		}
		
		return result;
	}

}
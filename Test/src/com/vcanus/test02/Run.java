package com.vcanus.test02;

public class Run {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int result = calculator.add(4).add(5).substract(3).out();
		System.out.println(result);
	}

}
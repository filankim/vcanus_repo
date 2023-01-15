package com.vcanus.test02;

public class Calculator {
	private int result;

	public Calculator add(int num) {
		this.result += num;
		return this;
	}

	public Calculator substract(int num) {
		this.result -= num;
		return this;
	}

	public int out() {
		return result;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(4).add(5).substract(3).out();
		System.out.println(result);
	}

}

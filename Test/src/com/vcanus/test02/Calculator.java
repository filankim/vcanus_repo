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

}

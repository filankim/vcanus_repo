package com.vcanus.test01.bread;

import java.util.Map;

public abstract class Bread {
	private String breadType;
	 
	public Bread(String breadType) {
		this.breadType = breadType;
	}

	public abstract Map<String, Integer> getRecipe();

	public String getBreadType() {
		return breadType;
	}

}

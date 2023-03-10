package com.vcanus.test01.bread;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreamBread extends Bread {
	
	public CreamBread() {
		super("cream");
	}

	@Override
	public Map<String, Integer> getRecipe() {
		//순서가 유지되야 하기때문에 LinkedHashMap으로 Map 생성
		Map<String, Integer> recipe = new LinkedHashMap<String, Integer>();
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("cream", 200);
		return recipe;
	}
	
}

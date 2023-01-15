package com.vcanus.test01.bread;

import java.util.LinkedHashMap;
import java.util.Map;

public class SugarBread extends Bread {
	
	public SugarBread() {
		super("sugar");
	}
	
	@Override
	public Map<String, Integer> getRecipe() {
		//������ �����Ǿ� �ϱ⶧���� LinkedHashMap���� Map ����
		Map<String, Integer> recipe = new LinkedHashMap<String, Integer>();
		recipe.put("flour", 100);
		recipe.put("water", 50);
		recipe.put("sugar", 200);
		return recipe;
	}
}

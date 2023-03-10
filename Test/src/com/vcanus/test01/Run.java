package com.vcanus.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vcanus.test01.bread.Bread;
import com.vcanus.test01.factory.BreadFactory;
import com.vcanus.test01.factory.VcanusFactory;

public class Run {
	public static void main(String[] args) {
		BreadFactory breadFactory = new VcanusFactory();
		
		//객체생성을 팩토리메소드에게 위임
		Bread bread1 = breadFactory.createBread("cream");
		Bread bread2 = breadFactory.createBread("sugar");
		Bread bread3 = breadFactory.createBread("butter");
		
		//리스트 생성
		List<Bread> bList = new ArrayList<Bread>();
		
		//리스트에 객체 삽입
		bList.add(bread1);
		bList.add(bread2);
		bList.add(bread3);
		
		//리스트 반복
		for(Bread b : bList) {
			System.out.println("breadType: " +b.getBreadType());
			System.out.println("recipe");
			
			Map<String, Integer> recipe = b.getRecipe();	

			//recipe 맵 키값 반복
			for (String key : recipe.keySet()) {
				System.out.println(key + ": " + recipe.get(key));
			}
			System.out.println(); // 개행
		}
	}

}

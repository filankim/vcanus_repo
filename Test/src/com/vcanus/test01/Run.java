package com.vcanus.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vcanus.test01.bread.Bread;
import com.vcanus.test01.bread.CreamBread;
import com.vcanus.test01.factory.BreadFactory;
import com.vcanus.test01.factory.VcanusFactory;

public class Run {
	public static void main(String[] args) {
		BreadFactory breadFactory = new VcanusFactory();
		
		//��ü������ ���丮�޼ҵ忡�� ����
		Bread bread1 = breadFactory.createBread("cream");
		Bread bread2 = breadFactory.createBread("sugar");
		Bread bread3 = breadFactory.createBread("butter");
		
		//����Ʈ ����
		List<Bread> bList = new ArrayList<Bread>();
		
		//����Ʈ�� ��ü ����
		bList.add(bread1);
		bList.add(bread2);
		bList.add(bread3);
		
		//����Ʈ �ݺ�
		for(Bread b : bList) {
			System.out.println("breadType: " +b.getBreadType());
			System.out.println("recipe");
			
			Map<String, Integer> recipe = b.getRecipe();	

			//recipe �� Ű�� �ݺ�
			for (String key : recipe.keySet()) {
				System.out.println(key + ": " + recipe.get(key));
			}
			System.out.println(); // ����
		}
	}

}
package com.vcanus.test01.factory;

import com.vcanus.test01.bread.Bread;
import com.vcanus.test01.bread.ButterBread;
import com.vcanus.test01.bread.CreamBread;
import com.vcanus.test01.bread.SugarBread;

public class VcanusFactory extends BreadFactory {

	@Override
	public Bread newBread(String breadType) {
		if (breadType.equals("cream")) {
			return new CreamBread();
		} else if (breadType.equals("butter")) {
			return new ButterBread();
		} else if (breadType.equals("sugar")) {
			return new SugarBread();
		}
		return null;
	}

}

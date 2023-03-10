package com.vcanus.test01.factory;

import com.vcanus.test01.bread.Bread;
import com.vcanus.test01.bread.ButterBread;
import com.vcanus.test01.bread.CreamBread;
import com.vcanus.test01.bread.SugarBread;

public abstract class BreadFactory { //Creator
	
	public Bread createBread(String breadType) {
		Bread bread = newBread(breadType);
		return bread;
	}
	
	abstract Bread newBread(String breadType);  // ???丮 ?޼ҵ?
}

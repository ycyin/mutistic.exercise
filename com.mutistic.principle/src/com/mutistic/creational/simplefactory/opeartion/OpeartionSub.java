package com.mutistic.creational.simplefactory.opeartion;

public class OpeartionSub extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionSub");
		return super.getNumberA() - super.getNumberB();
	}
	
}
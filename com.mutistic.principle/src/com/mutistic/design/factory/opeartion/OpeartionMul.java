package com.mutistic.design.factory.opeartion;

public class OpeartionMul extends Opeartion {

	@Override
	public double getResult() {
		System.out.println("\nOpeartionMul");
		return super.getNumberA() * super.getNumberB();
	}
	
}

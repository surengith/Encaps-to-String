package com.EncapsToString.com;

public class Single_Inheritance extends Inheritance{
	
	

	@Override
	public void name() {
		super.name();
	}

	@Override
	public void city() {
		super.city();
		System.out.println("Coimbatore");
	}

	@Override
	public void state() {
		super.state();
	}

	public static void main(String[] args) {
		
		Single_Inheritance obj =new Single_Inheritance();
		
		obj.name();
		obj.city();
		obj.state();

	}

}

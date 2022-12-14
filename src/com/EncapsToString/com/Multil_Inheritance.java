package com.EncapsToString.com;

public class Multil_Inheritance extends Single_Inheritance  {

	@Override
	public void name() {
		super.name();
		System.out.println("Suren");
	}

	@Override
	public void city() {
		super.city();
	}

	@Override
	public void state() {
		super.state();
		System.out.println("Kerala");
		System.out.println("Karanataka");
	}
	
	public static void main(String[] args) {
		
		Multil_Inheritance obj = new Multil_Inheritance();
		
		obj.name();
		obj.city();
		obj.state();
		
	}

}

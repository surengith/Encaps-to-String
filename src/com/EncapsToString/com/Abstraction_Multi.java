package com.EncapsToString.com;

public class Abstraction_Multi implements Abstraction, Abstraction_1 {

	
	
	@Override
	public void Name1() {
		System.out.println("Suren");
	}

	@Override
	public void City1() {
	
		System.out.println("Coimbatore");
	}

	@Override
	public void State1() {
	
		System.out.println("Kerala");
	}

	@Override
	public void Name() {
	
		System.out.println("Surendhar");
	}

	@Override
	public void City() {
		System.out.println("Erode");
	}

	@Override
	public void State() {
	
		System.out.println("Tamil Nadu");
	}

	public static void main(String[] args) {
		
		Abstraction_Multi obj = new Abstraction_Multi();
		obj.Name();
		obj.City();
		obj.State();
		obj.Name1();
		obj.City1();
		obj.State1();
	

	}

}

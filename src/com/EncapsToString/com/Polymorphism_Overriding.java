package com.EncapsToString.com;

public class Polymorphism_Overriding extends Polymorphism_Overloading {
	
	

	@Override
	public void Name(int a) {
		super.Name(a);
		System.out.println(a);
	}

	@Override
	public void Name(int a, int b) {
		super.Name(a, b);
		System.out.println(20 + 50 );
	}

	@Override
	public void Name(int a, int b, int c) {
		super.Name(a, b, c);
	}

	@Override
	public void Name(String d) {
		super.Name(d);
	}

	@Override
	public void Name(char e) {
		super.Name(e);

	}

	@Override
	public void Name(double f, double g) {
		super.Name(f, g);
	}
	

	public static void main(String[] args) {
		
		Polymorphism_Overriding obj = new Polymorphism_Overriding();
		
		obj.Name(20);
		obj.Name(20, 50);
		obj.Name(25, 15, 17);
		obj.Name("Surendhar");
		obj.Name('P');
		obj.Name(25.3, 44.8);
		
	
	}
	
	
	
}
	



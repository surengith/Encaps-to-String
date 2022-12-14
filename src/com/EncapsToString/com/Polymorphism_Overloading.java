package com.EncapsToString.com;

public class Polymorphism_Overloading {

	public void Name(int z) {
		System.out.println("amazon");
	}

	public void Name(int a, int b) {
		System.out.println("Grocery for Home");

	}

	public void Name(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void Name(String d) {
		System.out.println(d);
	}

	public void Name(char e) {
		System.out.println(e);
	}

	public void Name(double f, double g) {
		System.out.println(f + g);
	}

	public static void main(String[] args) {

		Polymorphism_Overloading obj = new Polymorphism_Overloading();

		obj.Name(10);
		obj.Name(20, 30);
		obj.Name(30, 40, 60);
		obj.Name("Surendhar");
		obj.Name('P');
		obj.Name(25.5, 65.2);

	}

}

package com.EncapsToString.com;

public class Methodoverriding extends Methodoverloading{
	

	@Override
	public void Name(String a) {
		super.Name(a);
		System.out.println("Suren");
		
	}

	@Override
	public void Name(char a) {
		super.Name(a);
	}

	@Override
	public void Name(int a) {
		super.Name(a);
		System.out.println(25);
	}

	public static void main(String[] args) {
		Methodoverriding obj = new Methodoverriding ();
		
		obj.Name("Name");
		obj.Name('s');
		obj.Name(6);

	}

}

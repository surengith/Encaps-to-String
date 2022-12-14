package com.EncapsToString.com;

public class Methodoverloading {
	
	public void Name (String a) {
		System.out.println("Surendhar");
	}
	
    public void Name (char a) {
    	System.out.println('P');
	}

    public void Name (int a) {
    	System.out.println(31);
    }

	

	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading();
		
		obj.Name("Name");
		obj.Name('K');
		obj.Name(3);
	}

}

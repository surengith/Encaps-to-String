package com.EncapsToString.com;

public class Variables {
	
	static int z = 60;
	
	public void Details () {
		
		int a = 10;
		int b = a, c = a;
		int d = 100, e = 25, f = 30;
		
		System.out.println(a);
		System.out.println(b + c);
		System.out.println(d+ e + f);

	}
	
	
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.Details();
		System.out.println(z);
		

}
	
}

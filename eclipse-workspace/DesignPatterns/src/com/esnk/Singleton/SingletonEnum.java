package com.esnk.Singleton;

public class SingletonEnum {
	
	public static void main(String args[]) {
		
		Abcd obj1=Abcd.INSTANCE;
		
		obj1.i=5;
		
		obj1.show();//5
		
		Abcd obj2=Abcd.INSTANCE;
		
		obj2.i=6;
		
		obj2.show();//6
		obj1.show();///6
		
	}

}

enum Abcd{
	INSTANCE;
	int i;
	
	public void show() {
		System.out.println(i);
	}
}

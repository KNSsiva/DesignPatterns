package com.esnk.Singleton;

public class Singleton {
	
	public static void main(String arg[]) {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Abc obj1=Abc.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Abc obj1=Abc.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}

}

class Abc{
	
	static Abc obj;
	
	private Abc() {
		System.out.println("Object created");
	}
	
	public static Abc getInstance() {
		if(obj==null) {
			synchronized (Abc.class) {
				if(obj==null) {
					obj=new Abc();
				}
			}
			
		}
		return obj;
	}
	
}

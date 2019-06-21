package com.phone;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OS obj=new Android();
		
		obj.spec();
		
		obj=new Windows();
		
		obj.spec();
		
		OperatingSystemFactory opFact=new OperatingSystemFactory();
		
		opFact.getInstance("closed").spec();
		
	}

}

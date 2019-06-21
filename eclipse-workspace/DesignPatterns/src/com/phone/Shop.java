package com.phone;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Phone p=new Phone("Android","Qualcomm",4.5,3000,32);
		
		Phone p=new PhoneBuilder().setOs("iOS").setCamera(32).getPhone();
		
		System.out.println(p);
	}

}

package com.esnk.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs=new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		System.out.println(bs);
		
		BookShop bs1=bs.clone();
		bs.getBooks().remove(1);
		bs1.setShopName("thriller");
		System.out.println(bs1);
		System.out.println(bs);
	}

}

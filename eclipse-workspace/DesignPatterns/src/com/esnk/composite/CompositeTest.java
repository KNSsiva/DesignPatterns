package com.esnk.composite;

public class CompositeTest {
	
	public static void main(String args[]) {
		Component hdd=new Leaf(4000,"HDD");
		Component mouse=new Leaf(500,"Mouse");
		Component monitor=new Leaf(3000,"Monitor");
		Component ram=new Leaf(1000,"Ram");
		Component cpu=new Leaf(500,"CPU");
		
		Composite ph=new Composite("peripheral");
		Composite cabinet=new Composite("cabinet");
		Composite mb=new Composite("Motherboard");
		Composite computer=new Composite("Computer");
		
		mb.addComponent(cpu);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		computer.showPrice();
	}

}

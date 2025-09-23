package com.tnsif.Interface;

public interface Interface {
	int a=10; //final and static
	void display();  //abstract method
}
class imple implements Interface{
	public void display()
	{
		System.out.println("this is implemeting class of Interface");
	}
}



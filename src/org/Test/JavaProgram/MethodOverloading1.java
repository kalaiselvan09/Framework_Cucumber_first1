package org.Test.JavaProgram;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class MethodOverloading1 {
	
	public void add() {
		int a=20,b=30;
		int c=a+b;
		System.out.println("The sum is::"+c);

	}
	public void add(int a)
	{
		int b=20;
		int c=a*b;
		System.out.println("The mul value is::"+c);
	}
	public void add(int a,int b)
	{
		int c=a/b;
		System.out.println("The Div value is ::"+c);
	}
	public void add(int id,String name)
	{
		System.out.println("The emp id is::"+id+" "+ " and Emp Name is ::"+name);
	}
	public static void main(String[] args) {
		MethodOverloading1 mo=new MethodOverloading1();
		mo.add();
		mo.add(20);
		mo.add(30,40);
		mo.add(20,"kalai");

	}

}

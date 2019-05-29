package org.Test.JavaProgram;

public class InterfaceMain implements InterfaceMethod{
	
	@Override
	public void even() {
		int num=20;
		if (num%2==0)
		{
			System.out.println("Even");
		}
	}

	@Override
	public void odd() {
		int num=17;
		if (num%2==1)
		{
			System.out.println("ODD");
		}
	}

	@Override
	public void leap() {
		int num=2000;
		if (num%4==0)
		{
			System.out.println("Leap");
		}
	}
public static void main(String[] args) {
		InterfaceMain irm=new InterfaceMain();
		irm.even();
		irm.odd();
		irm.leap();
	}
}

package org.Test.JavaProgram;

public class MethodOverriding2 extends MethodOverriding1{
	
	public void sum() {

		System.out.println("The sum is not working fine");
	}
	public void display()
	{
		System.out.println("kalaiselvan");
	}
	

	public static void main(String[] args) {

		MethodOverriding2 mo2=new MethodOverriding2();
		mo2.sum();
		mo2.display();
	}

}
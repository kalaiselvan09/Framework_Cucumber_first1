package org.Test.JavaProgram;

public class ClassB extends ClassA{
	private void mul() {


		int a=30,b=10;
		int c=a*b;
		System.out.println("The muliplication of 2 number is::"+c);
		
	}

	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.add();
		b.mul();

	}

}

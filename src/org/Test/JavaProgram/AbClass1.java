package org.Test.JavaProgram;

public class AbClass1 extends AbstractClass{
	public void add() {
		int a=20,b=30;
		int c=a+b;
		System.out.println("The sum is ::"+c);
	}

	public void mul() {
		int a=20,b=30;
		int c=a*b;
		System.out.println("The mul value is ::"+c);
	}

	public void div() {
		int a=20,b=30;
		float c=(a/b);
		System.out.println("The div value is ::"+c);
	}

public static void main(String[] args) {
		AbClass1 ab=new AbClass1();
		ab.add();
		ab.mul();
		ab.div();
	}

	
		
}

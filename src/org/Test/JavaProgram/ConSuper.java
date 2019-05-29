package org.Test.JavaProgram;

public class ConSuper extends ConSuperSupport{
	int a=450;
	
	public ConSuper(int a) {
		System.out.println("Without super keyword ::"+a);
		System.out.println("With super KeyWord::"+super.a);
		System.out.println("With This keyword::"+this.a);
		
	}

	public static void main(String[] args) {
		ConSuper cs=new ConSuper(30);
	}

}

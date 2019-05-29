package org.Test.JavaProgram;

public class Conthis1 {
	int a=20;
	public Conthis1(int a) {
		System.out.println("Without this keyword::"+a);
		System.out.println("With this Keyword::"+this.a);
	}

	public static void main(String[] args) {
		
		Conthis1 ct=new Conthis1(10);

	}

}

package org.Test.JavaProgram;

public class ConstructorPara {
	
	public ConstructorPara(int a, int b) {
		int c=a*b;
		System.out.println(c);
		
	}
	
	public ConstructorPara(String a, int b) {
		
		System.out.println("Emp Name is ::"+a);
		System.out.println("Emp id is::"+b);
		
	}
	

	public static void main(String[] args) {
		ConstructorPara cp=new ConstructorPara(10,20);
		ConstructorPara cp1=new ConstructorPara("kalaiselvan",20);
	}

}

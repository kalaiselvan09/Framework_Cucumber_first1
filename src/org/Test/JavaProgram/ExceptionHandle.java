package org.Test.JavaProgram;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			System.out.println("kalaiselvan");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("always executed");
		}
	}

}

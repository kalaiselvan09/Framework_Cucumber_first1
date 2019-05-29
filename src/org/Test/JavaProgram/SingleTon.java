package org.Test.JavaProgram;

public class SingleTon {

	static SingleTon sin;
	private SingleTon()
	{
		
	}
	 public static SingleTon getInstance() {
		 if(sin==null)
		 {
			 sin=new SingleTon();
			 
		 }
		// System.out.println(sin);
		 return sin;

	}
	 
	 public void empId() {
		 System.out.println("12345");
	}
	 
	 public static void empName() {
		 System.out.println("kalaiselvan");
	}
	public static void main(String[] args) {
		SingleTon s=getInstance();
		empName();
		s.empId();
	}
}
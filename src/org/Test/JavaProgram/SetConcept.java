package org.Test.JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		
		Set<String> si=new HashSet();
		si.add("kalai");
		si.add("mani");
		si.add("jasmine");
		si.add("flower");
		si.add("Ramu");
		si.add("kalai");//duplicate value not allowed
		int a=si.size();
		System.out.println(a);
		for (String str: si) {
			System.out.println(str);
			
		}
		
	}

}

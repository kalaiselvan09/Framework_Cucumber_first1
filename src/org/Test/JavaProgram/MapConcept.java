package org.Test.JavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		
		Map<Integer,String> mp=new HashMap();
		mp.put(1,"kalai");
		mp.put(2, "ramu");
		mp.put(3, "lakshmi");
		mp.put(4,"jasmine");
		mp.put(5, "mani");
		mp.put(2, "mani"); // overwrite the ramu =mani
		Set<Entry<Integer,String>> set=mp.entrySet();
		for (Entry<Integer, String> x: set) {
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
		
		
		
		
		

	}

}

package org.Test.JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserMapMain {
	public static void main(String[] args) {
		Map<Integer,User> mp=new HashMap<>();
		User u1=new User();
		u1.setId(1);
		u1.setName("kalai");
		u1.setPhone(989845678l);
		
		User u2=new User();
		u2.setId(2);
		u2.setName("rani");
		u2.setPhone(885445678l);
		
		User u3=new User();
		u3.setId(1);
		u3.setName("mani");
		u3.setPhone(983235288l);
		
		
		mp.put(1,u1);
		mp.put(2,u2);
		mp.put(3,u3);
		
		Set<Entry<Integer,User>> si=mp.entrySet();
			
		for (Entry<Integer,User> user : si) {
		
			System.out.println(user.getKey());
			System.out.println(user.getValue().getId());
			System.out.println(user.getValue().getName());
			System.out.println(user.getValue().getPhone());
			
			
		}
	}
}


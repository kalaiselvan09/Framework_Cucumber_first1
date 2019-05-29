package org.Test.JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserSetMain {
	public static void main(String[] args) {
		Set<User> si=new HashSet<>();
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
		
		
		si.add(u1);
		si.add(u2);
		si.add(u3);
		
		
		for (User user : si) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getPhone());
			
			
		}
}
	
}


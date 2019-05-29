package org.Test.JavaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserListMain {

	public static void main(String[] args) {
		List<User> li=new ArrayList<>();
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
		
		
		li.add(u1);
		li.add(u2);
		li.add(u3);
		
	/*	for (int i=0;i<li.size();i++) {
			System.out.println("Id is ::"+li.get(i).getId());
			System.out.println("Name is ::"+li.get(i).getName());
			System.out.println("Phone number is::"+li.get(i).getPhone());
			
			
		}*/
		for (User user : li) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getPhone());
			
			
		}

	}

}

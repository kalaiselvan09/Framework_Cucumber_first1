package org.Test.JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList();
		li.add(10);
		li.add(2);
		li.add(23);
		li.add(2);
		li.add(10);
		for(int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i)==li.get(j))
				{
					System.out.println("Duplicate found");
					System.out.println(li.get(i));
				}
			}
			}
			
		}
		
		
		

	}


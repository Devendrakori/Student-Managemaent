package com.sept10;

import java.util.ArrayList;
import java.util.List;

public class Marks {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<Integer>();
		int m1=88;
		Integer i1=new Integer(m1);
		int[]arr= {1,5,8,7,9};
		marks.add(99);
		marks.add(66);
		marks.add(50);
		marks.add(99);
		marks.add(25);
		marks.add(m1);
//		System.out.println(marks);
//		System.out.println("\n"+marks.size());
		for(int i=0;i<marks.size();i++)
		{
//			if(marks.get(i)==)
			System.out.print(marks.get(i)+" ");
		}
	}
}

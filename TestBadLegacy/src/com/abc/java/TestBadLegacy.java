package com.abc.java;
import java.util.*;
public class TestBadLegacy {

	public static void main(String[] args) {
		List<Integer>myList=new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList);
		System.out.print(myList);

	}

}

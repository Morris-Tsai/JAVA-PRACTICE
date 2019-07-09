package com.abc.java;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("morris", "morris's messages");
		map.put("ken", "ken's messages");
		map.put("kaho", "kaho's messages");
		Collection collection=map.values();
		Iterator iterator= collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

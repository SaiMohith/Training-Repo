package com.map;
/*	Map(Interface)  :  	it contains <key,value> pair
 * 						it Doesn't allows Duplicate key,but it allows duplicate values
 * 					 	it provides randome order while retriving  or iterating of data
 *	HashMap(Class)  :  	HashMap is used when we want randome output and  <key,value> pair */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10001, "aaa");
		hm.put(10002, "bbb");
		hm.put(10003, "ccc");
		hm.put(10004, "ddd");
		hm.put(10005, "eee");
		hm.put(10006, "fff");
		hm.put(10007, "ggg");
		hm.put(10008, "hhh");

		Set s = hm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
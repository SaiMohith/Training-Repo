package com.map;
/*Map(Interface)  :  	it contains <key,value> pair
* 						it Doesn't allows Duplicate key,but it allows duplicate values
* 					 	it provides randome order while retriving  or iterating of data
*LinkedHashMap(Class) : LinkedHashMap is used when we want insertion order output and <key,value> pair */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(10001, "aaa");
		lhm.put(10002, "bbb");
		lhm.put(10003, "ccc");
		lhm.put(10004, "ddd");
		lhm.put(10005, "eee");
		lhm.put(10006, "fff");
		lhm.put(10007, "ggg");
		lhm.put(10008, "hhh");

		Set s = lhm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Entry e = (Map.Entry) itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}
}

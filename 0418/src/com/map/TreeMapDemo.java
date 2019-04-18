package com.map;
/*Map(Interface)  :  	it contains <key,value> pair
* 						it Doesn't allows Duplicate key,but it allows duplicate values
* 					 	it provides randome order while retriving  or iterating of data
*TreeMap(Class) : 		TreeMap is used when we want assending order output and <key,value> pair ----this assending order takes place through key value*/

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(10001, "aaa");
		tm.put(10001, "aab");
		tm.put(10022, "bbb");
		tm.put(10019, "ccc");
		tm.put(10020, "ddd");
		tm.put(10015, "eee");
		tm.put(10012, "fff");
		tm.put(100119, "ggg");
		tm.put(10005, "hhh");
		tm.put(10001, "aac");

		Set s = tm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Entry e = (Map.Entry) itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
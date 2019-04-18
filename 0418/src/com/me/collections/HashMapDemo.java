package com.me.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class HashMapDemo {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	
	//HashMap<Integer, String> hm=new HashMap<Integer,String>();
	//LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer,String>();	
	TreeMap<Integer, String> hm=new TreeMap<Integer,String>();

	hm.put(1, "Sparity");
	hm.put(2, "Infotech");
	hm.put(23, "IBM");
	hm.put(4, "TCS");
	hm.put(5, "CSC");
	hm.put(26, "Google");
	hm.put(7, "Oracle");
	hm.put(8, "dhgf");
	hm.put(19, "Sparity");

	Set s=hm.entrySet();

	Iterator itr=s.iterator();

	while(itr.hasNext()){
		Map.Entry m=(Map.Entry) itr.next(); 
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}

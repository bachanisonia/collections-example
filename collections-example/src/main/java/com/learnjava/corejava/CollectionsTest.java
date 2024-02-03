package com.learnjava.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class CollectionsTest {
	
	/* ArrayList */
	public static void testArrayList() 
	{
		ArrayList<String> strlist = new ArrayList<>();
		
		strlist.add("sonia");
		strlist.add("bachani");
		strlist.add("khatri");
		
		for(String s : strlist)
		{
			System.out.println("The elements in the ArrayList are : " + s);
		}
		
		strlist.stream().forEach(System.out::println);
	}
	
	
	/* LinkedList */
	public static void testLinkedList()
	{
		
		LinkedList<Integer> intlinklist = new LinkedList<>();
		
		intlinklist.add(10);
		intlinklist.add(15);
		intlinklist.addFirst(5);
		intlinklist.addLast(20);
		
		System.out.println("The elements in the final Linked List are : ");
		intlinklist.stream().forEach(System.out::println);
	}
	
	
	/* TreeSet */
	public static void testTreeSet()
	{
		
		TreeSet<Integer> treeset = new TreeSet<>();
		
		treeset.add(18);
		treeset.add(5);
		treeset.add(3);
		treeset.add(1);
		treeset.add(4);
		treeset.add(15);
		
		Object[] sortedarr = treeset.toArray();
		
		System.out.println("Printing the 3rd smallest element in the array : " + sortedarr[3]);
		
		System.out.println("The elements in the TreeSet are : ");
		Iterator<Integer> it = treeset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	
	/* Hashmap */
	public static void testHashMap()
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "sonia");
		hm.put(2, "bachani");
		hm.put(3, "khatri");
		
		System.out.println("The value for the hashmap key 1 is : " + hm.get(1));
		
		
		for (Map.Entry<Integer, String> e : hm.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
	}
	
	
}

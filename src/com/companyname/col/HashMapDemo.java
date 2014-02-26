package com.companyname.col;

import java.util.HashMap;
import java.util.Map;
/**
 * HashMapDemo creates a hashmap of String keys and Integer values. Each key is one of the commandline
arguments passed to this application, and its value is the number of occurrences of that argument
on the command line.
 *
 */
class HashMapDemo
{
	public static void main(String[] args)
	{
		Map<String, Integer> argMap = new HashMap<>();
		for (String arg: args)
		{
			Integer count = argMap.get(arg);
			argMap.put(arg, (count == null) ? 1 : count+1);
		}
		for (String str: args)
			System.out.print(str + " ");
		System.out.println("\n");
		System.out.println(argMap);
		System.out.println("Number of distinct arguments = "+argMap.size());
	}
}

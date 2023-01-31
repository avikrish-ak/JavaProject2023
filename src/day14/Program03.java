package day14;

import java.util.*;

public class Program03 {

	public static void main(String[] args) {
		Hashtable<Integer,String> x= new Hashtable<>();
		x.put(101, "aa");
		x.put(102, "bb");
		x.put(101, "aaa");
		x.put(103, "bb");
		//x.put(null, null);
		System.out.println(x);
		x.remove(101);
		System.out.println(x);
		x.remove(102, "bb");
		System.out.println(x);
		System.out.println(x.size());
		x.put(101, "aa");
		x.put(102, "bb");		
		System.out.println(x);		
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.entrySet());
		x.replace(102, "aaa");
		x.put(104, "aaa");//replace and new key
		System.out.println(x);
		
	}

}

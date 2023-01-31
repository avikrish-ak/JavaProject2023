package day14;

import java.util.*;

public class Program01 {

	public static void main(String[] args) {
		
		HashSet<String> x= new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("aa");
		x.add("bb");
		x.add("cc");
		System.out.println(x);
		x.remove("cc");
		System.out.println(x);
		System.out.println(x.size());
		
		String[] y= {"abc","bcd","cde"};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		x.removeAll(Arrays.asList(y));
		System.out.println(x);
		
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("abc"));
		
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x.isEmpty());
		System.out.println(x);
	}

}

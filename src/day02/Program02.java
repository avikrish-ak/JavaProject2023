package day02;

public class Program02 {

public static void main(String[] args) {
		addFunction(10, 20);
		addFunction(10.1, 20.2);
		addFunction(101, 202,303);	
		
	}
	
	
	public static void addFunction(int m, int n)
	{
		System.out.println(m+n);
	}
	public static void addFunction(double m, double n)
	{
		System.out.println(m+n);
	}
	public static void addFunction(int m, int n, int l)
	{
		System.out.println(m+n+l);
	}

}

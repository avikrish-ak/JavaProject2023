package day01;

public class Program01 {

	byte a=-128;
	static short b= 32767;
	int c=1234567;
	long d=67890898l;
	boolean x=true;
	char y='1';
	float ab=0.1f;
	double bc=0.1d;
	
	//static method will allows only static users
	public static void main(String[] args) {
		Program01 abc = new Program01();			
		abc.fun();
		int main=10;
		System.out.println(main);
		
		System.out.println("Good Day..!");	
		
		System.out.println(abc.c);
		
	}
	
	
	public void fun()
	{
		System.out.println("Besant Tech..!");
	}
	

}

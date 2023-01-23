package day09;

public class Program2 {

	public static void main(String[] args) {
		
		whileLoop();
		forLoop();
		doLoop();
	}
	
	public static void whileLoop()
	{
		int fact=20;
		int x=1;
		long temp=1;
		while(x<=fact)
		{
			temp=temp*x;			
			x++;
		}
		System.out.println(fact+"   "+temp);
		
	}
	
	public static void doLoop()
	{
		int fact=8;
		int x=1;
		int temp=1;
		do
		{
			temp=temp*x;			
			x++;
		}while(x<=fact);
		System.out.println(fact+"   "+temp);
		
	}
	
	public static void forLoop()
	{
		int fact=8;
		int temp=1;
		for(int x=1;x<=fact;x++)
		{
			temp=temp*x;			
		}
		System.out.println(fact+"   "+temp);
	}
	

}

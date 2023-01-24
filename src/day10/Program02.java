package day10;

public class Program02 {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
		
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}

	}

}

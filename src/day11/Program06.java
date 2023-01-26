package day11;

public class Program06 {

	public static void main(String[] args) {
		/*
		1
		2 4
		3 9 3
		4 16 4 16
		5 25 5 25 5
		 */

		for(int a=1;a<=5;a++)
		{ 
			boolean x=true;
			for(int b=1;b<=a;b++)
			{
				
				if(x)
				{
					System.out.print(a+" ");
					x=false;
				}
				else
				{
				System.out.print(a*a+" ");
				x=true;
				}				
			}
			System.out.println();
		}
	}

}

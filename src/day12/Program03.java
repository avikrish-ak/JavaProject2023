package day12;

public class Program03 {

	public static void main(String[] args) {
		int y[] = {10,20,75,30,40,45,50,65,60,55};
		System.out.println("Odd Number");
		for(int val:y)
		{
			if(val%2!=0)
			{
			System.out.println(val);
			}
		}
		System.out.println("Even Number");
		for(int val:y)
		{
			if(val%2==0)
			{
			System.out.println(val);
			}
		}
		
		
	}

}

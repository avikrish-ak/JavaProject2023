package day12;

public class Program02 {

	public static void main(String[] args) {
		int y[] = {10,20,75,30,40,45,50,65,60,55};
		System.out.println("Length of y :- "+y.length);
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		int a=0;
		while(a<y.length)
		{
			System.out.println(y[a]);
			a++;
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		//{10,20,75,30,40,45,50,65,60,55}
		for(int val:y)
		{
			System.out.println(val);
		}
		
	}

}

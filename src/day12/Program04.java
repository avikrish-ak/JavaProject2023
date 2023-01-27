package day12;

public class Program04 {

	public static void main(String[] args) {
		int y[] = {10,20,75,103,40,7,50,65,11,5};
		
		for(int n:y)
		{
		boolean x=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				x=false;
				break;
			}
		}
		if(x)
		{
			System.out.println(n);
		}
	
		}

	}

}

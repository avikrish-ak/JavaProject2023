package day11;

public class Program03 {

	public static void main(String[] args) {
		/*
		1
		22
		333
		4444
		55555
		 */

		int a=1;
		do {
			
			int b=1;
			do {
				System.out.print(a);
				b++;
			}while(b<=a);		
			
			System.out.println();
			a++;
		}while(a<=5);

	}

}

package day11;

public class Program02 {

	public static void main(String[] args) {
		/*
		5
		54
		543
		5432
		54321
		 */

		int a=5;
		do {
			int b=5;
			do {
				System.out.print(b);
				b--;
			}while(b>=a);
			System.out.println();
			a--;
		}while(a>=1);

	}

}

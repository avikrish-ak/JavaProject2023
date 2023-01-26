package day11;

public class Program01 {

	public static void main(String[] args) {
		/*
		54321
		5432
		543
		54
		5
		 */

		int a=1;
		do {
			int b=5;
			do {
				System.out.print(b);
				b--;
			}while(b>=a);
			System.out.println();
			a++;
		}while(a<=5);

	}

}

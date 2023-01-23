package day09;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		forLoop();

	}
	
	public static void whileLoop()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Table value :- ");
		int tables=input.nextInt();
		input.close();
		int a=1;
		while(a<=10)
		{
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		}
	}
	
	public static void doLoop()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Table value :- ");
		int tables=input.nextInt();
		input.close();
		int a=1;
		do
		{
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		}while(a<=10);
	}
	
	public static void forLoop()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Table value :- ");
		int tables=input.nextInt();
		input.close();
		for(int a=1;a<=10;a++)
		{
			System.out.println(tables+"x"+a+"="+tables*a);
		}
	}
	

}

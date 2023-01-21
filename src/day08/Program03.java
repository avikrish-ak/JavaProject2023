package day08;

public class Program03 {
//x=x+1 x=x-1
	public static void main(String[] args) {
		int x=1;
		
		int y=++x;//y=2 x=2
		System.out.println(y+"    "+x);
		
		int z=x++;//z=2 x=3
		System.out.println(z+"    "+x);
		
		int a=1;
		int b=--a;//b=0 a=0
		System.out.println(b+"    "+a);
		int c=a--;//c=0 a=-1
		System.out.println(c+"    "+a);
	}

}
